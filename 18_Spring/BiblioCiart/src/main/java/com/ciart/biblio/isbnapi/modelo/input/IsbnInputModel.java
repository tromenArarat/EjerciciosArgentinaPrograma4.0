package com.ciart.biblio.isbnapi.modelo.input;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IsbnInputModel {
	private List<BookInputModel> items;
}

