package model;

import java.util.ArrayList;
import java.util.List;

public class PedidoDataSource {

	int codigoPedido = 0;
	int codigoItem = 0;
	
	
	static List<Pedido> pedidos = new ArrayList<Pedido>();
	static List<ItemPedido> itemPedidos = new ArrayList<ItemPedido>();
	
	public int adicionarPedido(String nomeFilial, String nomeCliente) {
		
		Pedido p = new Pedido();
		codigoPedido = codigoPedido + 1;
		p.setCodPedido(codigoPedido);
		p.setNomeFilial(nomeFilial);
		p.setNomeCliente(nomeCliente);
		pedidos.add(p);
		
		System.out.println("Pedido Gerado: " + codigoPedido);
		
		return numeroPedido;
	}
	
    public void adicionarItemPedido(int codigoPedido, String nomeProduto, int quantidade, double valorProduto) {
		
		ItemPedido item = new ItemPedido();
		codigoItem = codigoItem + 1;
		item.setCodigoItemProduto(codigoItem);
	
		itemPedidos.add(item);
		
		System.out.println("Codigo do Pedido: " codigoPedido + " Item do Pedido: " + codigoItem);
	}
	
	void listarPedidos(int codigoPedido) {
		
		
		
	}
	
}