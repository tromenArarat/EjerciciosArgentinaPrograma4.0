package com.ciart.biblio.isbnapi.modelo.input;

import java.util.List;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class VolumeInfoInputModel {
	private String title;
	private String publishedDate;
	private String description;
	private String language;
	private int pageCount;
	private List<String> authors;
	private List<IdentifierInputModel> industryIdentifiers;
	private List<String> categories;
}