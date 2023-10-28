package com.ciart.biblio.domain.service;

import com.ciart.biblio.domain.model.VolumeInfo;
import com.ciart.biblio.model.input.IsbnInputModel;
import com.ciart.biblio.model.input.BookInputModel;
import com.ciart.biblio.domain.exception.IsbnNotFoundException;
import com.ciart.biblio.domain.exception.MalformedIsbnException;
import com.ciart.biblio.domain.exception.IsbnInvalid;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class IsbnService {
		
	public VolumeInfo findIsbnManual(String isbn) {
		isbn = validatingIsbn(isbn);
		try {				
				URL url = new URL("https://www.googleapis.com/books/v1/volumes?q=isbn:"+isbn);
				URLConnection connection = url.openConnection();
				InputStream stream = connection.getInputStream();
				BufferedReader buffer = new BufferedReader(new InputStreamReader(stream,"UTF-8"));
				StringBuilder jsonIsbn = new StringBuilder();
				
				while((isbn = buffer.readLine())!=null) {
					jsonIsbn.append(isbn);
				}
				
				Gson gson = new Gson();
				IsbnInputModel isbnFromJson = gson.fromJson(jsonIsbn.toString(), IsbnInputModel.class);
				
				if(isbnFromJson.getItems()==null) {
					throw new IsbnNotFoundException(String.format("There is no code ISBN book %s", isbn));
				}
									
				return VolumeInfoAssembler(isbnFromJson.getItems());			
			
		} catch (MalformedURLException e ) {			
			throw new MalformedIsbnException("Wasn't possible generate URL.");
		} catch(IOException e) {
			throw new MalformedIsbnException("Wasn't possible generate URL.");
		}
	}
	
	private String validatingIsbn(String isbn) {
		if(isbn.length()==14&&isbn.contains("-")) {
			isbn=isbn.replace("-", "");
			return isbn;
		}else if(isbn.length()==10||isbn.length()==13) return isbn;
		else throw new IsbnInvalid("Isbn must be contains 10 or 13 digits");
		
	}
	
	private VolumeInfo VolumeInfoAssembler(List<BookInputModel> items) {
		VolumeInfo volume = new VolumeInfo();
		items.forEach(e ->{
			volume.setTitle(e.getVolumeInfo().getTitle());
			volume.setPageCount(e.getVolumeInfo().getPageCount());
			volume.setLanguage(e.getVolumeInfo().getLanguage());
			volume.setAuthors(e.getVolumeInfo().getAuthors());
			volume.setPublishedDate(e.getVolumeInfo().getPublishedDate());
			volume.setDescription(e.getVolumeInfo().getDescription());
			volume.setCategories(e.getVolumeInfo().getCategories());
			e.getVolumeInfo().getIndustryIdentifiers().forEach(f->{
				if(f.getType().equalsIgnoreCase("ISBN_10")) {
					volume.setIsbn_10(f.getIdentifier());
				}else {
					volume.setIsbn_13(f.getIdentifier());
				}
			});
		});
		return volume;
	}
}
