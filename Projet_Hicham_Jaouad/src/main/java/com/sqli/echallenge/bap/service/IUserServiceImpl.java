package com.sqli.echallenge.bap.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.sqli.echallenge.bap.dao.IUserDao;
import com.sqli.echallenge.bap.model.AdministrateurModel;
import com.sqli.echallenge.bap.model.CollaborateurModel;
import com.sqli.echallenge.bap.model.EvaluateurModel;
import com.sqli.echallenge.bap.model.ManagerModel;
import com.sqli.echallenge.bap.model.UserModel;


@Transactional
public class IUserServiceImpl implements IUserService {
	
	
	private IUserDao userDao;
	
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public UserModel save(UserModel um){
		return userDao.save(um);
	}

	@Override
	public UserModel edit(UserModel um){
		if(um != null)
		return userDao.edit(um);
		return null;
	}
	
	@Override
	public Boolean delete(String id){
		return userDao.delete(id);
	}
	
	@Override
	public UserModel find(String modelId){
		return userDao.find(modelId);
	}

	@Override
	public List<UserModel> findAll() {
		return userDao.findAll();
	}
	
	
	@Override
	public UserModel findUserByPsseudo(String user, String pass) {
		return userDao.findUserByPsseudo(user, pass);
	}

	@Override
	public List<CollaborateurModel> getAllCollaborateur() {
		
		List<CollaborateurModel> col = new ArrayList<CollaborateurModel>();
		List<UserModel> users = userDao.getAllUserByRole("COLLABORATEUR");
		if(users != null){
		for (UserModel userModel : users) {
				col.add((CollaborateurModel) userModel);	
		}	
		return col;
		}
		return null;
	}
	@Override
	public List<AdministrateurModel> getAllAdmin() {
		
		List<AdministrateurModel> col = new ArrayList<AdministrateurModel>();
		List<UserModel> users = userDao.getAllUserByRole("ADMINISTRATEUR");
		for (UserModel userModel : users) {
				col.add((AdministrateurModel) userModel);	
		}	
		return col;
	}
	
	
	@Override
	public List<ManagerModel> getAllManager() {
		
		List<ManagerModel> col = new ArrayList<ManagerModel>();
		List<UserModel> users = userDao.getAllUserByRole("MANAGER");
		for (UserModel userModel : users) {
				col.add((ManagerModel) userModel);	
		}	
		return col;
	}
	
	@Override
	public List<EvaluateurModel> getAllEvaluateur() {
	
	List<EvaluateurModel> col = new ArrayList<EvaluateurModel>();
	List<UserModel> users = userDao.getAllUserByRole("EVALUATEUR");
	for (UserModel userModel : users) {
			col.add((EvaluateurModel) userModel);	
	}	
	return col;
}
}
