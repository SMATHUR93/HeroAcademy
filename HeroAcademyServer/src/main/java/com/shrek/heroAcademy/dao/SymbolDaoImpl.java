package com.shrek.heroAcademy.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.shrek.heroAcademy.model.Symbol;

public class SymbolDaoImpl extends GenericDaoImpl<Symbol> implements ISymbolDao{
	
	@Transactional
	public List<Symbol> getAllSymbols() {
		return (List<Symbol>) findAll();
	}

	@Transactional
	public Symbol getSymbol(Long id){
		return (Symbol) find(id);
	}
	
	@Transactional
	public Symbol addSymbol(Symbol symbol){
		return (Symbol) create(symbol);
	}

	@Transactional
	public Symbol updateSymbol(Symbol symbol) {
		return (Symbol) update(symbol);
	}

	@Transactional
	public void deleteSymbol(Symbol symbol) {
		delete(symbol.getId());
	}

}
