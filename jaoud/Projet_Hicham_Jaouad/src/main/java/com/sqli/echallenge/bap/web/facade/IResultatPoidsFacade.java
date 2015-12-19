package com.sqli.echallenge.bap.web.facade;

import java.util.List;

import com.sqli.echallenge.bap.web.dto.DescriptionObjDto;
import com.sqli.echallenge.bap.web.dto.ResultatPoidsDto;

public interface IResultatPoidsFacade {

	public ResultatPoidsDto find(Long i);
	public Boolean delete(Long id);
	public ResultatPoidsDto edit(ResultatPoidsDto dto);
	public ResultatPoidsDto save(ResultatPoidsDto dto);
	public List<ResultatPoidsDto> findAll();
	public List<ResultatPoidsDto> setListRP(List<ResultatPoidsDto> list);

}
