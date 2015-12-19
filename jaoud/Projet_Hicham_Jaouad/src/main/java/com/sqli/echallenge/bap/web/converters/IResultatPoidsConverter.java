package com.sqli.echallenge.bap.web.converters;

import java.util.Collection;

import com.sqli.echallenge.bap.model.ResultatPoidsModel;
import com.sqli.echallenge.bap.web.dto.ResultatPoidsDto;

public interface IResultatPoidsConverter {

	public ResultatPoidsModel convertDtoModel(ResultatPoidsDto source);
	public ResultatPoidsModel convertDtoModel(ResultatPoidsDto source,boolean includeRelation);
	public ResultatPoidsDto convertModelDto(ResultatPoidsModel source);
	public ResultatPoidsDto convertModelDto(ResultatPoidsModel source, boolean includeRelation);
	
	public Collection<ResultatPoidsDto> converteListModelDto(Collection<ResultatPoidsModel> source, boolean includeRelation);
	public Collection<ResultatPoidsModel> converteListDtoModel(Collection<ResultatPoidsDto> source, boolean includeRelation);
	public Collection<ResultatPoidsDto> converteListModelDto(Collection<ResultatPoidsModel> source);
	public Collection<ResultatPoidsModel> converteListDtoModel(Collection<ResultatPoidsDto> source);
	
}
