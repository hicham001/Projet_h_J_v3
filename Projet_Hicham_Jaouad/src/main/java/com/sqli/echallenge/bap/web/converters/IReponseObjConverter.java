package com.sqli.echallenge.bap.web.converters;


import com.sqli.echallenge.bap.model.ReponseObjModel;
import com.sqli.echallenge.bap.web.dto.ReponseObjDto;

public interface IReponseObjConverter {

	public ReponseObjDto convertModelDto(ReponseObjModel source);
	public ReponseObjModel convertDtoModel(ReponseObjDto source);

	public ReponseObjDto convertModelDto(ReponseObjModel source, boolean includeRelation);
	public ReponseObjModel convertDtoModel(ReponseObjDto source, boolean includeRelation);

}
