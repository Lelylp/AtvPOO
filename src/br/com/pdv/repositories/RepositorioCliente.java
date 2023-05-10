package br.com.pdv.repositories;

import java.util.ArrayList;
import java.util.List;

import br.com.pdv.entities.Cliente;

public class RepositorioCliente implements RepositorioGenerico<Cliente>{
	
	private final List<Cliente> clientes = new ArrayList<Cliente>();
	private static RepositorioCliente instance;
	
	private RepositorioCliente() {
		
	}
	
	public static RepositorioCliente getInstance() {
		if (instance == null) {
			instance = new RepositorioCliente();
		}
		return instance;
	}

	@Override
	public void inserir(Cliente object) {
		clientes.add(object);
		
	}

	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
