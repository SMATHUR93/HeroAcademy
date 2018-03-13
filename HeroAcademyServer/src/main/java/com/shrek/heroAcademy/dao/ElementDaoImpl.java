package com.shrek.heroAcademy.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.shrek.heroAcademy.model.Element;

@Repository
public class ElementDaoImpl extends GenericDaoImpl<Element> implements IElementDao{
	
	public List<Element> getAllElements() {
		return (List<Element>) findAll();
	}

	public Element getElement(Long id){
		return (Element) find(id);
	}
	
	public Element addElement(Element element){
		return (Element)create(element);
	}

}