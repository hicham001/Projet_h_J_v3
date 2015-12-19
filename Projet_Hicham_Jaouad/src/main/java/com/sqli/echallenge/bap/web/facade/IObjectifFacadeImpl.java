package com.sqli.echallenge.bap.web.facade;

import java.util.ArrayList;
import java.util.List;

import com.sqli.echallenge.bap.model.ObjectifModel;
import com.sqli.echallenge.bap.service.IObjectifService;
import com.sqli.echallenge.bap.web.converters.IObjectifConverter;
import com.sqli.echallenge.bap.web.dto.DescriptionObjDto;
import com.sqli.echallenge.bap.web.dto.ObjectifDto;
import com.sqli.echallenge.bap.web.dto.ProjetDto;

public class IObjectifFacadeImpl implements IObjectifFacade{

	private IObjectifService objectifService;
	private IObjectifConverter converter;
	private IProjetFacade projetFacade;
	private IDescriptionObjFacade desFacade;
	

	public void setDesFacade(IDescriptionObjFacade desFacade) {
		this.desFacade = desFacade;
	}

	public void setObjectifService(IObjectifService objectifService) {
		this.objectifService = objectifService;
	}

	public void setConverter(IObjectifConverter converter) {
		this.converter = converter;
	}

	@Override
	public ObjectifDto find(Long modelId) {
		return converter.convertModelDto(objectifService.find(modelId));
	}

	@Override
	public Boolean delete(Long id) {
		return objectifService.delete(id);
	}

	@Override
	public ObjectifDto edit(ObjectifDto obj) {
		ObjectifModel objModel = converter.convertDtoModel(obj);
		if(objModel !=null)
			return converter.convertModelDto(objectifService.edit(objModel));
		return null;
		
	}

	@Override
	public ObjectifDto save(ObjectifDto obj) {
		ObjectifModel objModel = converter.convertDtoModel(obj);
		if(objModel !=null)
			return converter.convertModelDto(objectifService.save(objModel));
		return null;
	}

	@Override
	public List<ObjectifDto> findAll() {
		List<ObjectifDto> objDtoList = new ArrayList<ObjectifDto>();
		List<ObjectifModel> objList = objectifService.findAll();
		if(objList != null){
			for (ObjectifModel obj : objList) {
				objDtoList.add(converter.convertModelDto(obj));
			}
			return objDtoList;
		}
			return null;
	}

	@Override
	public List<ObjectifDto> saveObjectifs(List<ObjectifDto> list) {
		List<ObjectifDto> malist = new ArrayList<ObjectifDto>();
		if(list != null){
			for (ObjectifDto objectifDto : list) {
				if(objectifDto.getDescriptions()!=null)
				{
					malist.add(save(objectifDto));
				}
			}
		}
		
		return malist;
		
	}

	@Override
	public List<DescriptionObjDto> getDescriptionsss(ObjectifDto obj) {
		ObjectifDto obj1 = this.find(obj.getIdObjectif());
		
		return (List<DescriptionObjDto>) obj1.getDescriptions();
	}

}
