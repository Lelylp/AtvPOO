package br.com.pdv.entities;

import java.util.Objects;

public class Produto {
	
	private int id;
	private String codBarras;
	private String descricao;
	private double preco;
	private boolean paraMaiores = false;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCodBarras() {
		return codBarras;
	}
	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public boolean isParaMaiores() {
		return paraMaiores;
	}
	public void setParaMaiores(boolean paraMaiores) {
		this.paraMaiores = paraMaiores;
	}
	@Override
	public String toString() {
		return "Produto [id=" + id + ", codBarras=" + codBarras + ", descricao=" + descricao + ", preco=" + preco + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(codBarras);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(codBarras, other.codBarras);
	}

}
