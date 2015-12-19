package com.sqli.echallenge.bap.web.converters.Impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.sqli.echallenge.bap.model.ReponseObjModel;
import com.sqli.echallenge.bap.web.converters.ICollaborateurConverter;
import com.sqli.echallenge.bap.web.converters.IObjectifConverter;
import com.sqli.echallenge.bap.web.converters.IReponseObjConverter;
import com.sqli.echallenge.bap.web.dto.ReponseObjDto;

public class IReponseObjConverterImpl implements IReponseObjConverter{

	private IObjectifConverter objConverter;
	@Autowired
	private ICollaborateurConverter collaborateurConverter;
	
	public void setObjConverter(IObjectifConverter objConverter) {
		this.objConverter = objConverter;
	}

	@Override
	public ReponseObjDto convertModelDto(ReponseObjModel source) {
		return convertModelDto(source, true);
	}


	@Override
	public ReponseObjModel convertDtoModel(ReponseObjDto source) {
		return convertDtoModel(source, true);
	}

	@Override
	public ReponseObjDto convertModelDto(ReponseObjModel source, boolean includeRelation) {
		ReponseObjDto target = new ReponseObjDto();
		if(source != null){
			if(includeRelation){
		target.setCollaborateur(collaborateurConverter.convertModelDto(source.getCollaborateur(), false));
		target.setObjectif(objConverter.convertModelDto(source.getObjectif(),false));
			}
		
		target.setCreationDate(source.getCreationDate());
		target.setDeleted(source.isDeleted());
		target.setModifiedDate(source.getModifiedDate());
		
		target.setIdReponse(source.getIdReponse());
		target.setValeur(source.getValeur());
		target.setNbrRejet(source.getNbrRejet());
		//BeanUtils.copyProperties(source, target);
		return target;
		}
		return null;
	}

	@Override
	public ReponseObjModel convertDtoModel(ReponseObjDto source, boolean includeRelation) {
		ReponseObjModel target = new ReponseObjModel();
		if(source != null){
			if(includeRelation){
				target.setCollaborateur(collaborateurConverter.convertDtoModel(source.getCollaborateur(), false));
				target.setObjectif(objConverter.convertDtoModel(source.getObjectif(),false));
			}
		
		target.setCreationDate(source.getCreationDate());
		target.setDeleted(source.isDeleted());
		target.setModifiedDate(source.getModifiedDate());
		
		target.setIdReponse(source.getIdReponse());
		target.setValeur(source.getValeur());
		target.setNbrRejet(source.getNbrRejet());
		//BeanUtils.copyProperties(source, target);
		return target;
		}
		return null;
	}

}
