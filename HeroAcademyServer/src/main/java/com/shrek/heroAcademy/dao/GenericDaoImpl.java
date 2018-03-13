package com.shrek.heroAcademy.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

@Repository
public abstract class GenericDaoImpl<T> implements IGenericDao<T> {
	
	@PersistenceContext(unitName="heroAcademyPU")
    protected EntityManager em;

    private Class<T> type;
    
    private static Logger logger;

	@SuppressWarnings("unchecked")
	public GenericDaoImpl() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        type = (Class<T>) pt.getActualTypeArguments()[0];
        logger = Logger.getLogger(type);
    }

    @Override
    public T create(final T t) {
    	this.em.persist(t);
        this.em.flush();
        this.em.refresh(t);
        return t;
    }
    
    @Override
    public T find(final Object id) {
    	return (T) this.em.find(type, id);
    }
    
    @Override
    public T update(final T t) {
    	return this.em.merge(t);    
    }

    @Override
    public void delete(final Object id) {
    	this.em.remove(this.em.getReference(type, id));
    }
    
    @Override
    public long countAll(final Map<String, Object> params) {
    	StringBuffer queryString = new StringBuffer();
    	queryString.append("SELECT count(o) from ");
    	queryString.append(type.getSimpleName()).append(" o ");
    	final Query query = em.createQuery(queryString.toString());
    	return (Long) query.getSingleResult();
    }
    
    @Override
    public List<T> findAll(){
    	StringBuffer stringBuffer = new StringBuffer();
    	stringBuffer.append("SELECT e FROM ");
    	stringBuffer.append(type.getName());
    	stringBuffer.append(" e");
    	return em.createQuery(stringBuffer.toString(), type).getResultList();    	
    }

    
    /*public T findByEmployeeId(String id) {
    	StringBuffer stringBuffer = new StringBuffer();
    	stringBuffer.append("SELECT e FROM ");
    	stringBuffer.append(type.getName());
    	stringBuffer.append(" e");
    	stringBuffer.append(" WHERE e.employeeID = '");
    	stringBuffer.append(id);
    	stringBuffer.append("'");
    	stringBuffer.append(" AND e.projectName = '");
    	stringBuffer.append(projectName);
    	stringBuffer.append("'");
    	T emt=null;
    	try{
    		emt=em.createQuery(stringBuffer.toString(), type).getSingleResult();
        	System.out.println("result "+emt);        	       	  
    	}
    	catch(NoResultException e){
    		System.out.println("No Results Found");
    	}
    	catch(Exception e){
    		e.printStackTrace();
    	}    	
    	return emt;   
    }*/
    
	@Override
	@SuppressWarnings("unchecked")
    public List<T> findWithNamedQuery(String namedQueryName){
        return em.createNamedQuery(namedQueryName).getResultList();
    }
    

    @Override
    @SuppressWarnings("unchecked")
    public List<T> findWithNamedQuery(String queryName, int resultLimit) {
        return em.createNamedQuery(queryName).
                setMaxResults(resultLimit).
                getResultList();    
    }

    @SuppressWarnings("unchecked")
    public List<T> findByNativeQuery(String sql, Class<T> type) {
        return em.createNativeQuery(sql, type).getResultList();
    }
    
    @Override
	public List<T> findWithNamedQuery(String namedQueryName, Map<T, T> parameters) {
		return null;
	}
   
    /*@Override
    @SuppressWarnings("unchecked")
    public List<T> findWithNamedQuery(String namedQueryName, Map<T, T> parameters){
    	return findWithNamedQuery(namedQueryName, parameters, 0);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<T> findWithNamedQuery(String namedQueryName, Map<T,T> parameters,int resultLimit){
    	Set<T> rawParameters = parameters.keySet();
    	Query query = this.em.createNamedQuery(namedQueryName);
    	if(resultLimit > 0)
    		query.setMaxResults(resultLimit);
    	for (Entry entry : rawParameters) {
    		query.setParameter(entry.getKey(), entry.getValue());
    	}
    	return query.getResultList();
    }*/

}