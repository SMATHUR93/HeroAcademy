
package com.shrek.heroAcademy.dao;

import java.util.List;

import com.shrek.heroAcademy.model.Element;

public interface IElementDao extends IGenericDao<Element> {
	
	public List<Element> getAllElements();
	
	public Element getElement(Long id);
	
	public Element addElement(Element element);
}
