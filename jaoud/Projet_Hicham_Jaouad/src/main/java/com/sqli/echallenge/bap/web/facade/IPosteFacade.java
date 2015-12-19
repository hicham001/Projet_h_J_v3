package com.sqli.echallenge.bap.web.facade;

import java.util.List;

import com.sqli.echallenge.bap.web.dto.PosteDto;

public interface IPosteFacade {

	public PosteDto find(Long i);
	public Boolean delete(Long id);
	public PosteDto edit(PosteDto dto);
	public PosteDto save(PosteDto dto);
	public List<PosteDto> findAll();
}
