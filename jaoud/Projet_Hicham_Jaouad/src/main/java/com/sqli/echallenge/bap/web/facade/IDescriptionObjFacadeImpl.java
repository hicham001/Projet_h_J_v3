package com.sqli.echallenge.bap.web.facade;

import java.util.ArrayList;
import java.util.List;

import com.sqli.echallenge.bap.model.BAPModel;
import com.sqli.echallenge.bap.model.DescriptionObjModel;
import com.sqli.echallenge.bap.service.IDescriptionObjService;
import com.sqli.echallenge.bap.web.converters.IDescriptionObjConverter;
import com.sqli.echallenge.bap.web.dto.BAPDto;
import com.sqli.echallenge.bap.web.dto.DescriptionObjDto;
import com.sqli.echallenge.bap.web.dto.ResultatPoidsDto;

public class IDescriptionObjFacadeImpl implements IDescriptionObjFacade{

	private IDescriptionObjService descriptionObjService;
	private IDescriptionObjConverter converter;
	
	
	public void setDescriptionObjService(
			IDescriptionObjService descriptionObjService) {
		this.descriptionObjService = descriptionObjService;
	}

	public void setConverter(IDescriptionObjConverter converter) {
		this.converter = converter;
	}

	@Override
	public DescriptionObjDto find(Long i) {
		return converter.convertModelDto(descriptionObjService.find(i));
	}

	@Override
	public Boolean delete(Long id) {
		return descriptionObjService.delete(id);
	}

	@Override
	public DescriptionObjDto edit(DescriptionObjDto des) {
		DescriptionObjModel Model = converter.convertDtoModel(des);
		if(Model != null)
		return converter.convertModelDto(descriptionObjService.edit(Model));
		
		return null;
	}

	@Override
	public DescriptionObjDto save(DescriptionObjDto des) {
		DescriptionObjModel Model = converter.convertDtoModel(des);
		if(Model != null)
		return converter.convertModelDto(descriptionObjService.save(Model));
		
		return null;
	}

	@Override
	public List<DescriptionObjDto> findAll() {
		List<DescriptionObjDto> dtoList = new ArrayList<DescriptionObjDto>();
		List<DescriptionObjModel> model = descriptionObjService.findAll();
		if(model != null){
			for (DescriptionObjModel model2 : model) {
				dtoList.add(converter.convertModelDto(model2));
				
			}
			return dtoList;
		}
			return null;
	}

	@Override
	public List<DescriptionObjDto> saveListDescription(
			List<DescriptionObjDto> list) {
		List<DescriptionObjDto> malist = new ArrayList<DescriptionObjDto>();
		for (DescriptionObjDto descriptionObjDto : list) {
			malist.add(save(descriptionObjDto));
		}
		if(malist != null) 
			return malist;
		return null;
	}

	@Override
	public List<ResultatPoidsDto> getListrp(DescriptionObjDto des) {
		DescriptionObjDto d = this.find(des.getId());
		return (List<ResultatPoidsDto>) d.getResultatpoids();
	}

}
