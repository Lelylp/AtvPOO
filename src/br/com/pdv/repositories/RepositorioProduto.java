package br.com.pdv.repositories;

import java.util.ArrayList;
import java.util.List;

import br.com.pdv.entities.Produto;

public class RepositorioProduto implements RepositorioGenerico<Produto>{
	
	private final List<Produto> produtos = new ArrayList<Produto>();
	private static RepositorioProduto instance;
	
	private RepositorioProduto() {
		
	}
	
	public static RepositorioProduto getInstance() {
		if (instance == null) {
			instance = new RepositorioProduto();
		}
		return instance;
	}

	@Override
	public void inserir(Produto object) {
		produtos.add(object);
	}

	@Override
	public List<Produto> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
