package br.com.pdv.entities;

public class ItemVenda {
	private Produto produto;
	private int quantidade;
	private double valor;
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "ItemVenda [produto=" + produto + ", quantidade=" + quantidade + ", valor=" + valor + "]";
	}

}
