package com.shrek.heroAcademy.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shrek.heroAcademy.model.Element;

@Repository
public class ElementDaoImpl extends GenericDaoImpl<Element> implements IElementDao{
	
	@Transactional
	public List<Element> getAllElements() {
		return (List<Element>) findAll();
	}

	@Transactional
	public Element getElement(Long id){
		return (Element) find(id);
	}
	
	@Transactional
	public Element addElement(Element element){
		return (Element) create(element);
	}

	@Transactional
	public Element updateElement(Element element) {
		return (Element) update(element);
	}

	@Transactional
	public void deleteElement(Element element) {
		delete(element.getId());
	}

}