package com.sqli.echallenge.bap.dao;

import com.sqli.echallenge.bap.model.PosteModel;

public class IPosteDaoImpl extends GenericDaoImpl<PosteModel> implements IPosteDao{

	public IPosteDaoImpl() {
		super(PosteModel.class);
	}

}
