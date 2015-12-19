package com.sqli.echallenge.bap.service;

import java.util.List;

import com.sqli.echallenge.bap.model.FeedbackModel;

public interface IFeedbackService  {

	public FeedbackModel find(Long modelId);
	public Boolean delete(Long id);
	public FeedbackModel edit(FeedbackModel feedback);
	public FeedbackModel save(FeedbackModel feeback);
	public List<FeedbackModel> findAll();

}
