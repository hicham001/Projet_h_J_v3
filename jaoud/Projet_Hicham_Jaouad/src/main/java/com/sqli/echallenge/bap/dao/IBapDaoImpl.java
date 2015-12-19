package com.sqli.echallenge.bap.dao;

import com.sqli.echallenge.bap.model.BAPModel;

public class IBapDaoImpl extends GenericDaoImpl<BAPModel> implements IBapDao{

	public IBapDaoImpl() {
		super(BAPModel.class);
	}

}
