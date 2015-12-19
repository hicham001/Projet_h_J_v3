package com.sqli.echallenge.bap.web.converters;

import java.util.Collection;

import com.sqli.echallenge.bap.model.ProjetModel;
import com.sqli.echallenge.bap.model.QualificationModel;
import com.sqli.echallenge.bap.web.dto.ProjetDto;
import com.sqli.echallenge.bap.web.dto.QualificationDto;

public interface IProjetConverter {

	public ProjetDto convertModelDto(ProjetModel source);
	public ProjetModel convertDtoModel(ProjetDto source);
	
	public ProjetDto convertModelDto(ProjetModel source, boolean includeRelation);
	public ProjetModel convertDtoModel(ProjetDto source, boolean includeRelation);

	public Collection<ProjetDto> converteListModelDto(Collection<ProjetModel> source);
	public Collection<ProjetModel> converteListDtoModel(Collection<ProjetDto> source);

	public Collection<ProjetDto> converteListModelDto(Collection<ProjetModel> source, boolean includeRelation);
	public Collection<ProjetModel> converteListDtoModel(Collection<ProjetDto> source, boolean includeRelation);
}
