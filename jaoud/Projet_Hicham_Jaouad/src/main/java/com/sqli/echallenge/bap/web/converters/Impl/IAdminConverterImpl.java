package com.sqli.echallenge.bap.web.converters.Impl;


import com.sqli.echallenge.bap.model.AdministrateurModel;
import com.sqli.echallenge.bap.web.converters.IAdminConverter;
import com.sqli.echallenge.bap.web.dto.AdministrateurDto;

public class IAdminConverterImpl implements IAdminConverter{

	private ISujetConverterImpl sujetconverter;

	public void setSujetconverter(ISujetConverterImpl sujetconverter) {
		this.sujetconverter = sujetconverter;
	}

	@Override
	public AdministrateurDto convertModelDto(AdministrateurModel source) {
		return convertModelDto(source, true);
	}

	@Override
	public AdministrateurModel convertDtoModel(AdministrateurDto source) {
		// TODO Auto-generated method stub
		return convertDtoModel(source, true);
	}
	
	@Override
	public AdministrateurDto convertModelDto(AdministrateurModel source, boolean includeRelation) {
		AdministrateurDto target = new AdministrateurDto();
		if(source != null){
			if(includeRelation)
		target.setSujets(sujetconverter.convertListModelDto(source.getSujets(), false));
		
		target.setCreationDate(source.getCreationDate());
		target.setModifiedDate(source.getModifiedDate());
		target.setDeleted(source.isDeleted());
		
		target.setMatricule(source.getMatricule());
		target.setNom(source.getNom());
		target.setPrenom(source.getPrenom());
		target.setAdresse(source.getAdresse());
		target.setDateEmbauche(source.getDateEmbauche());
		target.setEmail(source.getEmail());
		target.setDateDN(source.getDateDN());
		target.setPhoto(source.getPhoto());
		target.setPassword(source.getPassword());
		target.setPsseudo(source.getPsseudo());
		target.setSexe(source.getSexe());
		target.setTelephone(source.getTelephone());
		//BeanUtils.copyProperties(source, target);
		return target;
		}
		return null;
	}

	@Override
	public AdministrateurModel convertDtoModel(AdministrateurDto source, boolean includeRelation) {
		AdministrateurModel target = new AdministrateurModel();
		if(source != null){
			if(includeRelation)
		target.setSujets(sujetconverter.convertListDtoModel(source.getSujets(), false));
		
		target.setCreationDate(source.getCreationDate());
		target.setModifiedDate(source.getModifiedDate());
		target.setDeleted(source.isDeleted());
		
		target.setMatricule(source.getMatricule());
		target.setNom(source.getNom());
		target.setPrenom(source.getPrenom());
		target.setAdresse(source.getAdresse());
		target.setDateEmbauche(source.getDateEmbauche());
		target.setEmail(source.getEmail());
		target.setDateDN(source.getDateDN());
		target.setPhoto(source.getPhoto());
		target.setPassword(source.getPassword());
		target.setPsseudo(source.getPsseudo());
		target.setSexe(source.getSexe());
		target.setTelephone(source.getTelephone());
		
		
		//BeanUtils.copyProperties(source, target);
		return target;
		}
		return null;
	}

	

}
