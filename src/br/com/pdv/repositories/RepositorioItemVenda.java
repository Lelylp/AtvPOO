package br.com.pdv.repositories;

import java.util.ArrayList;
import java.util.List;
import br.com.pdv.entities.ItemVenda;

public class RepositorioItemVenda implements RepositorioGenerico<ItemVenda>{
	
	private final List<ItemVenda> itensVenda = new ArrayList<ItemVenda>();
	private static RepositorioItemVenda instance;																																																														
	
	private RepositorioItemVenda() {
		
	}
	
	public static RepositorioItemVenda getInstance() {
		if (instance == null) {
			instance = new RepositorioItemVenda();
		}
		return instance;
	}


	@Override
	public void inserir(ItemVenda object) {
		itensVenda.add(object);
		
	}

	@Override
	public List<ItemVenda> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
