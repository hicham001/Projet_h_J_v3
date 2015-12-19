package com.sqli.echallenge.bap.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import com.sqli.echallenge.bap.dao.IBapDao;
import com.sqli.echallenge.bap.model.BAPModel;

@Transactional
public class IBapServiceImpl implements IBapService{

	private IBapDao bapDao;

	public void setBapDao(IBapDao bapDao) {
		this.bapDao = bapDao;
	}
	
	@Override
	public BAPModel find(Long modelId) {
		
		return bapDao.find(modelId);
	}

	@Override
	public Boolean delete(Long id) {
		return bapDao.delete(id);
	}

	@Override
	public BAPModel edit(BAPModel bap) {
		return bapDao.edit(bap);
	}

	@Override
	public BAPModel save(BAPModel bap) {
		return bapDao.save(bap);
	}

	@Override
	public List<BAPModel> findAll() {
		return bapDao.findAll();
	}

}
