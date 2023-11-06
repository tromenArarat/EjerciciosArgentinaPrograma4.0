
package com.ciart.biblio.controladores;

import com.ciart.biblio.isbnapi.assembler.VolumeInfoAssembler;
import com.ciart.biblio.isbnapi.modelo.VolumeInfoModel;
import com.ciart.biblio.isbnapi.domain.model.VolumeInfo;
import com.ciart.biblio.isbnapi.domain.service.IsbnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RequestMapping("/isbn")
public class IsbnController {
	
	@Autowired
	private IsbnService isbnService;
	
	@Autowired
	private VolumeInfoAssembler volumeInfoAssembler;

	@GetMapping("/{isbn}")
	public String find(@PathVariable String isbn, ModelMap modelo) {
		VolumeInfo volume = isbnService.findIsbnManual(isbn);
		VolumeInfoModel libro = (VolumeInfoModel) volumeInfoAssembler.toModel(volume);
                String descripcion = libro.getPublishedDate();
                modelo.addAttribute("descripcion", descripcion);
                return "isbn.html";
	}
}