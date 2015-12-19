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
	public List<UserModel> findUserByString(String mc) {
		Query q = em.createQuery("select u from users u where u.nom like :x or u.prenom like :x");
		q.setParameter("x","%"+ mc+"%");
		return   q.getResultList();
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
