package com.sqli.echallenge.bap.dao;

import java.util.List;








import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import com.sqli.echallenge.bap.model.UserModel;


public class IUserDaoImpl extends GenericDaoImpl<UserModel> implements IUserDao {

	public IUserDaoImpl() {
		super(UserModel.class);
	}
	
	@Override
	public UserModel findUserByPsseudo(String user, String pass) {
		Query q = em.createQuery("select u from UserModel u where u.psseudo like :x and u.password like :y");
		q.setParameter("x", user);
		q.setParameter("y", pass);
		if(!q.getResultList().isEmpty())
		return   (UserModel) q.getResultList().get(0);
		
		return null;
	}
	public List<UserModel> getAllUserByRole(String mc) {
		Query q = em.createQuery("select u from UserModel u where u.role_user like :x and u.deleted = :y");
	q.setParameter("x", "%"+ mc+"%");
	q.setParameter("y", false);
	return   q.getResultList();
	}

	@Override
	public UserModel find(String modelMat) {
		return (UserModel) this.em.find(UserModel.class, modelMat);
			
	}

	@Override
	public boolean delete(String mat) {
		UserModel user = (UserModel) find(mat);
	if(user != null) {
		user.setDeleted(true);
		edit(user);
		return true;
	}
	return false;
	}

	

}
