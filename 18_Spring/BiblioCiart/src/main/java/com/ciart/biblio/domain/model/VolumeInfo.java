package com.ciart.biblio.domain.model;

import com.ciart.biblio.entidades.Imagen;
import java.util.List;
import lombok.Data;

@Data
public class VolumeInfo {
	private String title;
	private String publishedDate;
	private String description;
	private String language;
	private int pageCount;
	private String isbn_10;
	private String isbn_13;
	private List<String> authors;
	private List<String> categories;
}
