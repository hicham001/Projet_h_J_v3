package com.sqli.echallenge.bap.web.facade;

import java.util.List;

import com.sqli.echallenge.bap.web.dto.SujetDto;

public interface ISujetFacade {
	public SujetDto find(Long i);
	public Boolean delete(Long id);
	public SujetDto edit(SujetDto sujet);
	public SujetDto save(SujetDto sujet);
	public List<SujetDto> findAll();

}
