package com.sqli.echallenge.bap.web.facade;

import java.util.ArrayList;
import java.util.List;

import com.sqli.echallenge.bap.model.BAPModel;
import com.sqli.echallenge.bap.model.PosteModel;
import com.sqli.echallenge.bap.service.IPosteService;
import com.sqli.echallenge.bap.web.converters.IPosteConverter;
import com.sqli.echallenge.bap.web.dto.BAPDto;
import com.sqli.echallenge.bap.web.dto.PosteDto;

public class IPosteFacadeImpl  implements IPosteFacade{

	private IPosteService posteService;
	private IPosteConverter converter;
	
	public void setPosteService(IPosteService posteService) {
		this.posteService = posteService;
	}

	public void setConverter(IPosteConverter converter) {
		this.converter = converter;
	}

	@Override
	public PosteDto find(Long i) {
		return converter.convertModelDto(posteService.find(i));
	}

	@Override
	public Boolean delete(Long id) {
		return posteService.delete(id);
	}

	@Override
	public PosteDto edit(PosteDto dto) {
		PosteModel Model = converter.convertDtoModel(dto);
		if(Model != null)
		return converter.convertModelDto(posteService.edit(Model));
		return null;
	}

	@Override
	public PosteDto save(PosteDto dto) {
		PosteModel Model = converter.convertDtoModel(dto);
		if(Model != null)
		return converter.convertModelDto(posteService.save(Model));
		return null;
	}

	@Override
	public List<PosteDto> findAll() {
		List<PosteDto> bapDtoList = new ArrayList<PosteDto>();
		List<PosteModel> bapModel = posteService.findAll();
		if(bapModel != null){
			for (PosteModel bapModel2 : bapModel) {
				bapDtoList.add(converter.convertModelDto(bapModel2));
			}
			return bapDtoList;
		}
			return null;
	}

}
