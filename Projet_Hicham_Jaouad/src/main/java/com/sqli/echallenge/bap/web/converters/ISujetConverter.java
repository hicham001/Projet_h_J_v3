package com.sqli.echallenge.bap.web.converters;

import java.util.Collection;

import com.sqli.echallenge.bap.model.SujetModel;
import com.sqli.echallenge.bap.web.dto.SujetDto;

public interface ISujetConverter {

	public SujetDto convertModelDto(SujetModel source);
	public SujetModel convertDtoModel(SujetDto source);

	public SujetDto convertModelDto(SujetModel source, boolean includeRelation);
	public SujetModel convertDtoModel(SujetDto source,  boolean includeRelation);

	public Collection<SujetModel> convertListDtoModel(Collection<SujetDto> source, boolean includeRelation);
	public Collection<SujetDto> convertListModelDto(Collection<SujetModel> source, boolean includeRelation);
	
	public Collection<SujetModel> convertListDtoModel(Collection<SujetDto> source);
	public Collection<SujetDto> convertListModelDto(Collection<SujetModel> source);
	
}
