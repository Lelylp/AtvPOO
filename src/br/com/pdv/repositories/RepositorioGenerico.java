package br.com.pdv.repositories;

import java.util.List;

public interface RepositorioGenerico<T> {
	
	public void inserir(T object);
	public List<T> listar();

}
