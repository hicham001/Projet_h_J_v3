package com.sqli.echallenge.bap.web.facade;

import java.util.List;

import com.sqli.echallenge.bap.web.dto.BAPDto;
import com.sqli.echallenge.bap.web.dto.DescriptionObjDto;
import com.sqli.echallenge.bap.web.dto.ResultatPoidsDto;

public interface IDescriptionObjFacade {
	

	public DescriptionObjDto find(Long i);
	public Boolean delete(Long id);
	public DescriptionObjDto edit(DescriptionObjDto des);
	public DescriptionObjDto save(DescriptionObjDto des);
	public List<DescriptionObjDto> findAll();
	public List<DescriptionObjDto> saveListDescription(List<DescriptionObjDto> list);
	public List<ResultatPoidsDto> getListrp(DescriptionObjDto des);

}
