package com.sqli.echallenge.bap.web.facade;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import com.sqli.echallenge.bap.model.BAPModel;
import com.sqli.echallenge.bap.service.IBapService;
import com.sqli.echallenge.bap.web.converters.IBapConverter;
import com.sqli.echallenge.bap.web.dto.BAPDto;

public class IBapFacadeimpl implements IBapFacade{
	
	private IBapService bapService;
	private IBapConverter converter;

	public void setBapService(IBapService bapService) {
		System.out.println("######################################bapService: injected");
		this.bapService = bapService;
	}

	public void setConverter(IBapConverter converter) {
		System.out.println("########################################converter: injected");
		this.converter = converter;
	}

	@Override
	public BAPDto find(Long modelId) {
		BAPModel bap = bapService.find(modelId);
		if(bap != null)
		return converter.convertModelDto(bap);
		return null;
	}

	@Override
	public Boolean delete(Long id) {
		return bapService.delete(id);
	}

	@Override
	public BAPDto edit(BAPDto feedback) {
		BAPModel bapModel = converter.convertDtoModel(feedback);
		if(bapModel != null)
		return converter.convertModelDto(bapService.edit(bapModel));
		return null;
	}

	@Override
	public BAPDto save(BAPDto feedback) {
		System.out.println("##########################converter : " + converter);//chafti ? :/ colConverter null, att nwarik ac dir :v
		
		BAPModel bapModel = converter.convertDtoModel(feedback);
		if(bapModel != null)
		return converter.convertModelDto(bapService.save(bapModel));
		
		return null;
	}

	@Override
	public List<BAPDto> findAll() {
		List<BAPDto> bapDtoList = new ArrayList<BAPDto>();
		List<BAPModel> bapModel = bapService.findAll();
		if(bapModel != null){
			for (BAPModel bapModel2 : bapModel) {
				bapDtoList.add(converter.convertModelDto(bapModel2));
			}
			return bapDtoList;
		}
			return null;
	}

}
