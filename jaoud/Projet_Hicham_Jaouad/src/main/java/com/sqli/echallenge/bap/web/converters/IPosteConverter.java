package com.sqli.echallenge.bap.web.converters;

import com.sqli.echallenge.bap.model.PosteModel;
import com.sqli.echallenge.bap.web.dto.PosteDto;

public interface IPosteConverter {

	public PosteDto convertModelDto(PosteModel source);
	public PosteModel convertDtoModel(PosteDto source);

	public PosteDto convertModelDto(PosteModel source, boolean includeRelation);
	public PosteModel convertDtoModel(PosteDto source, boolean includeRelation);

}
