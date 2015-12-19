package com.sqli.echallenge.bap.web.facade;

import java.util.List;

import com.sqli.echallenge.bap.web.dto.BAPDto;

public interface IBapFacade {

	public BAPDto find(Long i);
	public Boolean delete(Long id);
	public BAPDto edit(BAPDto dto);
	public BAPDto save(BAPDto dto);
	public List<BAPDto> findAll();

}
