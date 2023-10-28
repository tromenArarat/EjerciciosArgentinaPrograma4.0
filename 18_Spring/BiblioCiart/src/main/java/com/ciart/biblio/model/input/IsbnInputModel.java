package com.ciart.biblio.model.input;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IsbnInputModel {
	private List<BookInputModel> items;
}

