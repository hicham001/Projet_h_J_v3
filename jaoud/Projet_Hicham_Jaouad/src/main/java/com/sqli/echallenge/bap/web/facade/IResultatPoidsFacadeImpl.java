package com.sqli.echallenge.bap.web.facade;

import java.util.ArrayList;
import java.util.List;

import com.sqli.echallenge.bap.model.ResultatPoidsModel;
import com.sqli.echallenge.bap.service.IResultatPoidsService;
import com.sqli.echallenge.bap.web.converters.IResultatPoidsConverter;
import com.sqli.echallenge.bap.web.dto.ResultatPoidsDto;

public class IResultatPoidsFacadeImpl implements IResultatPoidsFacade {
	
	private IResultatPoidsService resultatPoidService;
	private IResultatPoidsConverter resultatPoidConverter;
	
	public void setResultatPoidService(IResultatPoidsService resultatPoidService) {

		System.out.println("######################################RESULTATPOidService: injected");
		this.resultatPoidService = resultatPoidService;
	}

	public void setResultatPoidConverter(
			IResultatPoidsConverter resultatPoidConverter) {

		System.out.println("######################################RESULTATPOidConverter: injected");
		this.resultatPoidConverter = resultatPoidConverter;
	}

	@Override
	public ResultatPoidsDto find(Long i) {
		return resultatPoidConverter.convertModelDto(resultatPoidService.find(i));
	}

	@Override
	public Boolean delete(Long id) {
		return resultatPoidService.delete(id);
	}

	@Override
	public ResultatPoidsDto edit(ResultatPoidsDto dto) {
		ResultatPoidsModel Model = resultatPoidConverter.convertDtoModel(dto);
		if(Model !=null)
			return resultatPoidConverter.convertModelDto(resultatPoidService.edit(Model));
		return null;
	}

	@Override
	public ResultatPoidsDto save(ResultatPoidsDto dto) {
		ResultatPoidsModel Model = resultatPoidConverter.convertDtoModel(dto);
		if(Model !=null)
			return resultatPoidConverter.convertModelDto(resultatPoidService.save(Model));
		return null;
	}

	@Override
	public List<ResultatPoidsDto> findAll() {
		List<ResultatPoidsDto> dtoList = new ArrayList<ResultatPoidsDto>();
		List<ResultatPoidsModel> list = resultatPoidService.findAll();
		if(list != null){
			for (ResultatPoidsModel obj : list) {
				dtoList.add(resultatPoidConverter.convertModelDto(obj));
			}
			return dtoList;
		}
			return null;
	}

	@Override
	public List<ResultatPoidsDto> setListRP(List<ResultatPoidsDto> list) {
		List<ResultatPoidsDto> listrp = new ArrayList<ResultatPoidsDto>();
		for(ResultatPoidsDto rp :list){
			ResultatPoidsDto p =this.save(rp);
			listrp.add(p);
		}
		return listrp;
	}

}
