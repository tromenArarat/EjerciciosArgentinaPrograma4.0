package com.ciart.biblio.isbnapi.assembler;

import com.ciart.biblio.isbnapi.modelo.VolumeInfoModel;
import com.ciart.biblio.isbnapi.domain.model.VolumeInfo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class VolumeInfoAssembler {

	@Autowired
	private ModelMapper modelMapper;
	
	public VolumeInfoModel toModel(VolumeInfo volumeInfo) {
		return modelMapper.map(volumeInfo, VolumeInfoModel.class);
	}
}
