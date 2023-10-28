package com.ciart.biblio.api.assembler;

import com.ciart.biblio.api.model.VolumeInfoModel;
import com.ciart.biblio.domain.model.VolumeInfo;
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
