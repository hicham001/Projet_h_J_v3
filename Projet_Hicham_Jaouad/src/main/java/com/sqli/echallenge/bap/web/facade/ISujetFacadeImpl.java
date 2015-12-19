package com.sqli.echallenge.bap.web.facade;

import java.util.ArrayList;
import java.util.List;

import com.sqli.echallenge.bap.model.BAPModel;
import com.sqli.echallenge.bap.model.SujetModel;
import com.sqli.echallenge.bap.service.ISujetService;
import com.sqli.echallenge.bap.web.converters.ISujetConverter;
import com.sqli.echallenge.bap.web.dto.BAPDto;
import com.sqli.echallenge.bap.web.dto.SujetDto;

public class ISujetFacadeImpl implements ISujetFacade{
	
	private ISujetService sujetService;
	private ISujetConverter converter;
	
	

	public void setSujetService(ISujetService sujetService) {
		this.sujetService = sujetService;
	}

	public void setConverter(ISujetConverter converter) {
		this.converter = converter;
	}

	@Override
	public SujetDto find(Long i) {
		return converter.convertModelDto(sujetService.find(i));
	}

	@Override
	public Boolean delete(Long id) {
		return sujetService.delete(id);
	}

	@Override
	public SujetDto edit(SujetDto sujet) {
		SujetModel model = converter.convertDtoModel(sujet);
		if(model != null)
		return converter.convertModelDto(sujetService.edit(model));
		return null;
	}

	@Override
	public SujetDto save(SujetDto sujet) {
		SujetModel model = converter.convertDtoModel(sujet);
		if(model != null)
		return converter.convertModelDto(sujetService.save(model));
		return null;
	}

	@Override
	public List<SujetDto> findAll() {
		List<SujetDto> dtoList = new ArrayList<SujetDto>();
		List<SujetModel> model = sujetService.findAll();
		if(model != null){
			for (SujetModel model2 : model) {
				dtoList.add(converter.convertModelDto(model2));
			}
			return dtoList;
		}
			return null;
	}

}
