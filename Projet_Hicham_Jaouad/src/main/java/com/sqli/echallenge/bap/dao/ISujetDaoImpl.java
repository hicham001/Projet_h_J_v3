package com.sqli.echallenge.bap.dao;

import com.sqli.echallenge.bap.model.SujetModel;

public class ISujetDaoImpl extends GenericDaoImpl<SujetModel> implements ISujetDao{

	public ISujetDaoImpl() {
		super(SujetModel.class);
	}

}
