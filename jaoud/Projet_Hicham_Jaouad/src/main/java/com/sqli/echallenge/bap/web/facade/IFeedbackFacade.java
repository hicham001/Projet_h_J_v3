package com.sqli.echallenge.bap.web.facade;

import java.util.List;

import com.sqli.echallenge.bap.web.dto.FeedbackDto;

public interface IFeedbackFacade {
	public FeedbackDto find(Long modelId);
	public Boolean delete(Long id);
	public FeedbackDto edit(FeedbackDto feedback);
	public FeedbackDto save(FeedbackDto feeback);
	public List<FeedbackDto> findAll();


}
