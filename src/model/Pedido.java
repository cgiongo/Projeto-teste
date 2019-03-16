
package model;

import java.util.ArrayList;
import java.util.List;

public class Pedido extends Base  {

	private String nomeCliente;
	private String nomeFilial;
	
	//static List<ItemPedido> itemPedidos = new ArrayList<ItemPedido>();
    
    public void setNomeCliente(String nomeCliente) {
    	
    	this.nomeCliente = nomeCliente;	
    }
    
    public void setNomeFilial(String nomeFilial) {
    	
         this.nomeFilial = nomeFilial;	
    }
    
    public void setCodPedido(int codigoPedido) {
    	
    	this.codigoPedido = codigoPedido;	
   }
   
}


