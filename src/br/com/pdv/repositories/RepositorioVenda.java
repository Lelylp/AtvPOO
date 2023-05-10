package br.com.pdv.repositories;

import java.util.ArrayList;
import java.util.List;

import br.com.pdv.entities.Venda;

public class RepositorioVenda implements RepositorioGenerico<Venda> {

	private final List<Venda> vendas = new ArrayList<Venda>();
	private static RepositorioVenda instance;
	
	private RepositorioVenda() {
		
	}
	
	public static RepositorioVenda getInstance() {
		if (instance == null) {
			instance = new RepositorioVenda();
		}
		return instance;
	}
	
	@Override
	public void inserir(Venda object) {
		vendas.add(object);
	}

	@Override
	public List<Venda> listar() {
		return new ArrayList<Venda>(vendas);
	}

}
