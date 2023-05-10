package br.com.pdv.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Venda {
	private int id;
	private String numero;
	private Cliente cliente;
	private Date data;
	private List<ItemVenda> itens = new ArrayList<ItemVenda>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public List<ItemVenda> getItens() {
		return itens;
	}
	public void setItens(List<ItemVenda> itens) {
		this.itens = itens;
	}
	@Override
	public String toString() {
		return "Venda [id=" + id + ", numero=" + numero + ", cliente=" + cliente + ", data=" + data + ", itens=" + itens
				+ ", getId()=" + getId() + ", getNumero()=" + getNumero() + ", getCliente()=" + getCliente()
				+ ", getData()=" + getData() + ", getItens()=" + getItens() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(numero);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venda other = (Venda) obj;
		return Objects.equals(numero, other.numero);
	}

}
