
package model;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
        
		int codigoDigitado;
		String textoDigitado;
		String nomeFilial;
		String nomeCliente;
		String nomeProduto;
		int quantidade;
		double valorProduto;
		
		Scanner sc = new Scanner(System.in);

		Scanner st = new Scanner(System.in);
		
		PedidoDataSource ds = new PedidoDataSource();

		//ItemPedido itm = new ItemPedido();

		do {

			System.out.println(
					"Digite o tipo de operação desejada:\n1 - Listar \n2 - Incluir \n3 - Alterar \n4 - Excluir \n5 - Sair");

			codigoDigitado = sc.nextInt();

			switch (codigoDigitado) {
			case 1: {
			}
				break;

			case 2: {

				// Incluir

				System.out.println("Digite o nome do cliente:");

				textoDigitado = st.nextLine();
				
				nomeFilial = textoDigitado;

				System.out.println("Digite a filial do cliente:");

				textoDigitado = st.nextLine();

				nomeCliente = textoDigitado;
				
				System.out.println("\n");

				ds.adicionarPedido(nomeFilial, nomeCliente);

				do {

					System.out.println("Digite 6 - para incluir um item ou 7 - para encerrar e gravar o pedido");

					codigoDigitado = sc.nextInt();

					if (codigoDigitado == 6) {

						System.out.println("Digite as informações do ítem do pedido conforme exemplo: " + "'"
								+ "NomeItem;qtdItem;Valor" + "'");

						textoDigitado = st.nextLine();

						String []  itens = textoDigitado.split(";");
						
						nomeProduto = itens[0];
						quantidade = Integer.valueOf(itens[1]);
						valorProduto = Double.valueOf(itens[2]);
						
						ds.adicionarItemPedido(codigoPedido,  nomeProduto,  quantidade,  valorProduto);

						System.out.println("\n");
					}

				} while (codigoDigitado != 7);

			}
				break;
				

			case 5: {
				System.out.println("Saindo...");

			}
				break;

			default: {
				System.out.println("Tipo de operação inválida!");
				break;
			}

		
			}
		} while (codigoDigitado != 5);

	}

}
