package com.sqli.echallenge.bap.web.converters;

import java.util.Collection;

import com.sqli.echallenge.bap.model.EvaluateurModel;
import com.sqli.echallenge.bap.web.dto.EvaluateurDto;

public interface IEvaluateurConverter {

	public EvaluateurDto convertModelDto(EvaluateurModel source);
	public EvaluateurModel convertDtoModel(EvaluateurDto source);

	public EvaluateurDto convertModelDto(EvaluateurModel source, boolean includeRelation);
	public EvaluateurModel convertDtoModel(EvaluateurDto source, boolean includeRelation);

	public Collection<EvaluateurDto> convertListModelDto(Collection<EvaluateurModel> source);
	public Collection<EvaluateurModel> convertListDtoModel(Collection<EvaluateurDto> source);
	
	public Collection<EvaluateurDto> convertListModelDto(Collection<EvaluateurModel> source, boolean includeRelation);
	public Collection<EvaluateurModel> convertListDtoModel(Collection<EvaluateurDto> source, boolean includeRelation);

	

}
