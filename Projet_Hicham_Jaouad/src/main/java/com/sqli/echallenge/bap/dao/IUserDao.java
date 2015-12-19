package com.sqli.echallenge.bap.dao;

import java.util.List;

import com.sqli.echallenge.bap.model.UserModel;

public interface IUserDao extends IGenericDao<UserModel> {
	
	public UserModel findUserByPsseudo(String user, String pass) ;
	public List<UserModel> getAllUserByRole(String mc);
    public UserModel find(String modelMat);
    public boolean delete(String mat);
}
