package com.sqli.echallenge.bap.web.converters;

import com.sqli.echallenge.bap.model.AdministrateurModel;
import com.sqli.echallenge.bap.web.dto.AdministrateurDto;

public interface IAdminConverter {

	public AdministrateurDto convertModelDto(AdministrateurModel source);
	public AdministrateurDto convertModelDto(AdministrateurModel source, boolean includeRelation);
	
	public AdministrateurModel convertDtoModel(AdministrateurDto source, boolean includeRelation);	
	public AdministrateurModel convertDtoModel(AdministrateurDto source);

}
