package com.sqli.echallenge.bap.dao;

import com.sqli.echallenge.bap.model.FeedbackModel;

public class IFeedbackDaoImpl extends GenericDaoImpl<FeedbackModel> implements IFeedbackDao{

	public IFeedbackDaoImpl() {
		super(FeedbackModel.class);
	}

}
