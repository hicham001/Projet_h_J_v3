package com.sqli.echallenge.bap.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.sqli.echallenge.bap.dao.IFeedbackDao;
import com.sqli.echallenge.bap.model.FeedbackModel;

@Transactional
public class IFeedbackServiceImpl  implements IFeedbackService{

	
	private IFeedbackDao feedbackDao;
	
	public void setFeedbackDao(IFeedbackDao feedbackDao) {
		this.feedbackDao = feedbackDao;
	}

	@Override
	public FeedbackModel find(Long modelId) {
		return feedbackDao.find(modelId);
	}

	@Override
	public Boolean delete(Long id) {
		return feedbackDao.delete(id);
	}

	@Override
	public FeedbackModel edit(FeedbackModel feedback) {
		return feedbackDao.edit(feedback);
	}

	@Override
	public FeedbackModel save(FeedbackModel feeback) {
		return feedbackDao.save(feeback);
	}

	@Override
	public List<FeedbackModel> findAll() {
		return feedbackDao.findAll();
	}

}
