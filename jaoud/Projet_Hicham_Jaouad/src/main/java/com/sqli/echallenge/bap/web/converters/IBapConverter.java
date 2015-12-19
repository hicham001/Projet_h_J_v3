package com.sqli.echallenge.bap.web.converters;

import java.util.Collection;

import com.sqli.echallenge.bap.model.BAPModel;
import com.sqli.echallenge.bap.model.ObjectifModel;
import com.sqli.echallenge.bap.web.dto.BAPDto;
import com.sqli.echallenge.bap.web.dto.ObjectifDto;

public interface IBapConverter {
	public BAPDto convertModelDto(BAPModel source);
	public BAPModel convertDtoModel(BAPDto source);
	
	public BAPDto convertModelDto(BAPModel source, boolean includeRelation);
	public BAPModel convertDtoModel(BAPDto source, boolean includeRelation);

	public Collection<BAPDto> convertListModelDto(Collection<BAPModel> source);
	public Collection<BAPModel> convertListDtoModel(Collection<BAPDto> source);
	
	public Collection<BAPDto> convertListModelDto(Collection<BAPModel> source, boolean includeRelation);
	public Collection<BAPModel> convertListDtoModel(Collection<BAPDto> source, boolean includeRelation);
	

}
