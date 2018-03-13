package com.shrek.heroAcademy.dao;

import java.util.List;

import com.shrek.heroAcademy.model.Symbol;

public class SymbolDaoImpl extends GenericDaoImpl<Symbol> implements ISymbolDao{
	
	public List<Symbol> getAllSymbols() {
		return (List<Symbol>) findAll();
	}

	public Symbol getSymbol(Long id){
		return (Symbol) find(id);
	}
	
	public Symbol addSymbol(Symbol symbol){
		return (Symbol)create(symbol);
	}

}
