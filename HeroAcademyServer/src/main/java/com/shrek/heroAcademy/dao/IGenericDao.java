package com.shrek.heroAcademy.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public interface IGenericDao<T> {

  long countAll(Map<String, Object> params);
  T create(T t);
  T find(Object id);
  List<T> findAll();
  T update(T t);
  void delete(Object id);
  public List<?> findWithNamedQuery(String queryName);
  public List<T> findWithNamedQuery(String queryName,int resultLimit);
  public List<T> findWithNamedQuery(String namedQueryName, Map<T, T> parameters);
  //public List<T> findWithNamedQuery(String namedQueryName, Map<T, T> parameters,int resultLimit);
}