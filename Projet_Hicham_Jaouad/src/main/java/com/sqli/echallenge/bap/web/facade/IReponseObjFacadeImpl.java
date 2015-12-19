package com.sqli.echallenge.bap.web.facade;

import java.util.ArrayList;
import java.util.List;

import com.sqli.echallenge.bap.model.ReponseObjModel;
import com.sqli.echallenge.bap.service.IReponseObjService;
import com.sqli.echallenge.bap.web.converters.IReponseObjConverter;
import com.sqli.echallenge.bap.web.dto.ReponseObjDto;

public class IReponseObjFacadeImpl implements IReponseObjFacade{

	
	private IReponseObjService reponseObjService;
	private IReponseObjConverter converter;
	
	public void setReponseObjService(IReponseObjService reponseObjService) {
		this.reponseObjService = reponseObjService;
	}

	public void setConverter(IReponseObjConverter converter) {
		this.converter = converter;
	}

	@Override
	public ReponseObjDto find(Long modelId) {
		return converter.convertModelDto(reponseObjService.find(modelId));
	}

	@Override
	public Boolean delete(Long id) {
		return reponseObjService.delete(id);
	}

	@Override
	public ReponseObjDto edit(ReponseObjDto model) {
		ReponseObjModel Model = converter.convertDtoModel(model);
		if(Model !=null)
			return converter.convertModelDto(reponseObjService.edit(Model));
		return null;
	}

	@Override
	public ReponseObjDto save(ReponseObjDto model) {
		ReponseObjModel Model = converter.convertDtoModel(model);
		if(Model !=null)
			return converter.convertModelDto(reponseObjService.save(Model));
		return null;
	}

	@Override
	public List<ReponseObjDto> findAll() {
		List<ReponseObjDto> dtoList = new ArrayList<ReponseObjDto>();
		List<ReponseObjModel> list = reponseObjService.findAll();
		if(list != null){
			for (ReponseObjModel obj : list) {
				dtoList.add(converter.convertModelDto(obj));
			}
			return dtoList;
		}
			return null;
	}


}
