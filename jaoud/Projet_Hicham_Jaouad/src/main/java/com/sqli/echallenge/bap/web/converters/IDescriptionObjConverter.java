package com.sqli.echallenge.bap.web.converters;

import java.util.Collection;

import com.sqli.echallenge.bap.model.DescriptionObjModel;
import com.sqli.echallenge.bap.web.dto.DescriptionObjDto;

public interface IDescriptionObjConverter {

	public DescriptionObjDto convertModelDto(DescriptionObjModel source);
	public DescriptionObjModel convertDtoModel(DescriptionObjDto source);
	
	public DescriptionObjDto convertModelDto(DescriptionObjModel source, boolean includeRelation);
	public DescriptionObjModel convertDtoModel(DescriptionObjDto source, boolean includeRelation);
	
	public Collection<DescriptionObjDto> convertListModelDto(Collection<DescriptionObjModel>  source);
	public Collection<DescriptionObjModel> convertListDtoModel(Collection<DescriptionObjDto> source);
	
	public Collection<DescriptionObjDto> convertListModelDto(Collection<DescriptionObjModel>  source, boolean includeRelation);
	public Collection<DescriptionObjModel> convertListDtoModel(Collection<DescriptionObjDto> source, boolean includeRelation);
	
}
