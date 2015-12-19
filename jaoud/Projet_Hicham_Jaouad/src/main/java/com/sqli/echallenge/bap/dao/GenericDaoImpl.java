package com.sqli.echallenge.bap.dao;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.sqli.echallenge.bap.model.AbstractModel;


abstract public class GenericDaoImpl<T extends AbstractModel> implements IGenericDao<T> {

	@PersistenceContext
	protected EntityManager em;
	
    private Class<T> type;
   
	public GenericDaoImpl(Class<T> type) {
		this.type = type;
	}
	
	public T save(T abstractModel) {
		em.persist(abstractModel);
		return abstractModel;
		
	}

	public T edit(T abstractModel) {
		if(abstractModel != null){
		em.merge(abstractModel);
			return abstractModel;
		}
		return null;
			
	}
	
	public boolean delete(Long modelId) {
		T abstractModel = (T) find(modelId);
		if(abstractModel != null) {
			abstractModel.setDeleted(true);
			edit(abstractModel);
			return true;
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	public T find(Long modelId) {
		return (T) this.em.find(type, modelId);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		Query q = em.createQuery("select t from "+type.getSimpleName()+" t where t.deleted = :del").setParameter("del", false);
		return q.getResultList();
	}
}
