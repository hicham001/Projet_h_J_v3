package com.sqli.echallenge.bap.dao;

import java.util.List;

import com.sqli.echallenge.bap.model.AbstractModel;


public interface IGenericDao<T extends AbstractModel> {
	public T save(T abstractModel);
    public T edit(T abstractModel);
    public boolean delete(Long modelId);
    public T find(Long modelId);
    public List<T> findAll();
  
}
