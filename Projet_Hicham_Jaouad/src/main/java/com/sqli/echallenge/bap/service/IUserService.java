package com.sqli.echallenge.bap.service;

import java.util.List;

import com.sqli.echallenge.bap.model.AdministrateurModel;
import com.sqli.echallenge.bap.model.CollaborateurModel;
import com.sqli.echallenge.bap.model.EvaluateurModel;
import com.sqli.echallenge.bap.model.ManagerModel;
import com.sqli.echallenge.bap.model.UserModel;

public interface IUserService {
	public List<UserModel> findAll();
	public UserModel find(String modelId);
	public Boolean delete(String id);
	public UserModel edit(UserModel user);
	public UserModel save(UserModel um);
	public UserModel findUserByPsseudo(String user, String pass);
	public List<EvaluateurModel> getAllEvaluateur();
	public List<AdministrateurModel> getAllAdmin();
	public List<CollaborateurModel> getAllCollaborateur();
	public List<ManagerModel> getAllManager();
	
}
