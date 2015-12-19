package com.sqli.echallenge.bap.web.converters;

import com.sqli.echallenge.bap.model.ManagerModel;
import com.sqli.echallenge.bap.web.dto.ManagerDto;

public interface IManagerConverter {

	public ManagerModel convertDtoModel(ManagerDto source);
	public ManagerModel convertDtoModel(ManagerDto source, boolean includeRelation);
	
	public ManagerDto convertModelDto(ManagerModel source);
	public ManagerDto convertModelDto(ManagerModel source, boolean includeRelation);

}
