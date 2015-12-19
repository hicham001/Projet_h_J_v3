package com.sqli.echallenge.bap.web.facade;

import java.util.List;

import com.sqli.echallenge.bap.web.dto.ReponseObjDto;

public interface IReponseObjFacade {
	

	public ReponseObjDto find(Long modelId);
	public Boolean delete(Long id);
	public ReponseObjDto edit(ReponseObjDto model);
	public ReponseObjDto save(ReponseObjDto model);
	public List<ReponseObjDto> findAll();

}
