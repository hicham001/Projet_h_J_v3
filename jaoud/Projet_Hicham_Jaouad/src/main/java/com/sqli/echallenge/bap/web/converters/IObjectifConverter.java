package com.sqli.echallenge.bap.web.converters;

import java.util.Collection;

import com.sqli.echallenge.bap.model.ObjectifModel;
import com.sqli.echallenge.bap.web.dto.ObjectifDto;

public interface IObjectifConverter {

	public ObjectifDto convertModelDto(ObjectifModel source);
	public ObjectifModel convertDtoModel(ObjectifDto source);
	
	public ObjectifDto convertModelDto(ObjectifModel source, boolean includeRelation);
	public ObjectifModel convertDtoModel(ObjectifDto source, boolean includeRelation);

	public Collection<ObjectifDto> convertListModelDto(Collection<ObjectifModel> source);
	public Collection<ObjectifModel> convertListDtoModel(Collection<ObjectifDto> source);
	
	public Collection<ObjectifDto> convertListModelDto(Collection<ObjectifModel> source, boolean includeRelation);
	public Collection<ObjectifModel> convertListDtoModel(Collection<ObjectifDto> source, boolean includeRelation);

}
