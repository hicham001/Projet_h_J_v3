package com.sqli.echallenge.bap.web.facade;

import java.util.List;

import com.sqli.echallenge.bap.web.dto.DescriptionObjDto;
import com.sqli.echallenge.bap.web.dto.ObjectifDto;
import com.sqli.echallenge.bap.web.dto.ProjetDto;

public interface IObjectifFacade {

	public ObjectifDto find(Long modelId);
	public Boolean delete(Long id);
	public ObjectifDto edit(ObjectifDto obj);
	public ObjectifDto save(ObjectifDto obj);
	public List<ObjectifDto> findAll();
	public List<ObjectifDto> saveObjectifs(List<ObjectifDto> list);
	public List<DescriptionObjDto> getDescriptionsss(ObjectifDto obj);
	public List<ObjectifDto> editObjectifsCollab(List<ObjectifDto> objectifs);

}
