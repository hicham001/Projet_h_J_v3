package com.sqli.echallenge.bap.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.sqli.echallenge.bap.dao.IObjectifDao;
import com.sqli.echallenge.bap.model.DescriptionObjModel;
import com.sqli.echallenge.bap.model.ObjectifModel;
import com.sqli.echallenge.bap.model.ProjetModel;
import com.sqli.echallenge.bap.web.facade.IProjetFacade;

@Transactional
public class IObjectifServiceImpl implements IObjectifService{

	private IObjectifDao objectifDao;
	private IProjetFacade projetFacade;
	
	
	public void setProjetFacade(IProjetFacade projetFacade) {
		this.projetFacade = projetFacade;
	}

	public void setObjectifDao(IObjectifDao objectifDao) {
		this.objectifDao = objectifDao;
	}

	@Override
	public ObjectifModel find(Long modelId) {
		return objectifDao.find(modelId);
	}

	@Override
	public Boolean delete(Long id) {
		return objectifDao.delete(id);
	}

	@Override
	public ObjectifModel edit(ObjectifModel obj) {
		return objectifDao.edit(obj);
	}

	@Override
	public ObjectifModel save(ObjectifModel obj) {
			if(obj.getDescriptions() != null){
				for(DescriptionObjModel des : obj.getDescriptions())
					des.setObjectif(obj);
			}
		return objectifDao.save(obj);
	}

	@Override
	public List<ObjectifModel> findAll() {
		return objectifDao.findAll();
	}

}
