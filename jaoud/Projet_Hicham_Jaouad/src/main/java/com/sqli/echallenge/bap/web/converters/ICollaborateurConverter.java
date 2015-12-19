package com.sqli.echallenge.bap.web.converters;

import java.util.Collection;

import com.sqli.echallenge.bap.model.CollaborateurModel;
import com.sqli.echallenge.bap.web.dto.CollaborateurDto;

public interface ICollaborateurConverter {

	public CollaborateurModel convertDtoModel(CollaborateurDto source);
	public CollaborateurModel convertDtoModel(CollaborateurDto source,boolean includeRelation);
	public CollaborateurDto convertModelDto(CollaborateurModel source);
	public CollaborateurDto convertModelDto(CollaborateurModel source, boolean includeRelation);
	
	public Collection<CollaborateurDto> converteListModelDto(Collection<CollaborateurModel> source, boolean includeRelation);
	public Collection<CollaborateurModel> converteListDtoModel(Collection<CollaborateurDto> source, boolean includeRelation);
	public Collection<CollaborateurDto> converteListModelDto(Collection<CollaborateurModel> source);
	public Collection<CollaborateurModel> converteListDtoModel(Collection<CollaborateurDto> source);
	

}
