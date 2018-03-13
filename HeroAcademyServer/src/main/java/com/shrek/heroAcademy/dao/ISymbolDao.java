package com.shrek.heroAcademy.dao;

import java.util.List;

import com.shrek.heroAcademy.model.Symbol;

public interface ISymbolDao extends IGenericDao<Symbol> {
	
	public List<Symbol> getAllSymbols();
	
	public Symbol getSymbol(Long id);
	
	public Symbol addSymbol(Symbol symbol);
	
}
