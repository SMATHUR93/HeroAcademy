package com.shrek.heroAcademy.to;

import java.util.List;

import com.shrek.heroAcademy.model.Element;
import com.shrek.heroAcademy.model.Race;
import com.shrek.heroAcademy.model.Skill;
import com.shrek.heroAcademy.model.Symbol;

public class AllInformationTO {
	
	List<Element> elements;
	List<Race> races;
	List<Symbol> symbols;
	List<Skill> skills;
	
	public List<Element> getElements() {
		return elements;
	}
	
	public void setElements(List<Element> elements) {
		this.elements = elements;
	}

	public List<Race> getRaces() {
		return races;
	}

	public void setRaces(List<Race> races) {
		this.races = races;
	}

	public List<Symbol> getSymbols() {
		return symbols;
	}

	public void setSymbols(List<Symbol> symbols) {
		this.symbols = symbols;
	}

	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}
	
}