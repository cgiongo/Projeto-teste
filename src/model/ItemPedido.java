package model;

import model.Base;


public class ItemPedido extends Base  {
	private int quantidade;
	private String nomeProduto;
	private double valorProduto;
	private int codigoItem;
	
	
	public void getQuantidade(int quantidade) {
		this.quantidade = quantidade;
		
	}
	
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
		
	}
	
	public void setValorProduto(double valorproduto) {
		this.valorProduto = valorProduto;
		
		
	}
	public void setCodigoItemProduto(int codigoItem) {
		this.codigoItem = codigoItem;
		
	}

	
	
	
}
