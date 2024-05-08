package ecommerce;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                   E-commerce                        ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Visualizar Produtos                  ");
			System.out.println("            2 - Adicionar produto ao carrinho        ");
			System.out.println("            3 - Remover produto do carrinho          ");
			System.out.println("            4 - Ver carrinho                         ");
			System.out.println("            5 - Limpar carrinho                      ");
			System.out.println("            6 - Pesquisar produtos                   ");
			System.out.println("            7 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println("\nSua melhor loja online de compras!");
				sobre();
                 leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Visualizar Produtos\n\n");

					break;
				case 2:
					System.out.println("Adicionar produto ao carrinho\n\n");

					break;
				case 3:
					System.out.println("Remover produto do carrinho\n\n");

					break;
				case 4:
					System.out.println("Ver carrinho\n\n");

					break;
				case 5:
					System.out.println("Limpar carrinho\n\n");

					break;
				case 6:
					System.out.println("Pesquisar produtos\n\n");

					break;
				case 7:
					System.out.println("Sair\n\n");

					break;
			}
		}
	}
    
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por:Bernardo Henrique Carvalho ");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("https://github.com/BernardSaturn");
		System.out.println("*********************************************************");
	}
}