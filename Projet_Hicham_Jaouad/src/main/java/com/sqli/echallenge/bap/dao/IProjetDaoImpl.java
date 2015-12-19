package com.sqli.echallenge.bap.dao;

import com.sqli.echallenge.bap.model.ProjetModel;
public class IProjetDaoImpl extends GenericDaoImpl<ProjetModel> implements IProjetDao{

	public IProjetDaoImpl() {
		super(ProjetModel.class);
	}

	@Override
	public ProjetModel find(String modelMat) {
		return (ProjetModel) this.em.find(ProjetModel.class, modelMat);
	}

	@Override
	public boolean delete(String mat) {
		ProjetModel projet = (ProjetModel) find(mat);
		if(projet != null) {
			projet.setDeleted(true);
			edit(projet);
			return true;
		}
		return false;
	}

}
