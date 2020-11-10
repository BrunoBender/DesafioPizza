package pacote;

import java.util.Scanner;

public class Tela {

	public static void main(String[] agrs) {
		Scanner teclado = new Scanner(System.in);
		Banco banco = new Banco();
		int menu = 0;
		System.out.println("------------ Pizzaria ------------");
		System.out.println("");

		while (menu != 1) {

			System.out.println("Digite o nome: ");
			String nome = teclado.next();
			System.out.println("Digite o tamanho: ");
			double tamanho = teclado.nextDouble();

			boolean teste = banco.testeTamanho(tamanho);
			if (teste) {
				System.out.println("Digite o Preço: ");
				double preco = teclado.nextDouble();
				double cmQuadrado = banco.calcCmQuadrado(tamanho, preco);
				double porcento = banco.getPorcento(cmQuadrado);
				if (porcento == 0) {
					Pizza pizza = new Pizza(nome, tamanho, preco, cmQuadrado, "Melhor CB");
					banco.addPizza(pizza);
				}
				else {
					Pizza pizza = new Pizza(nome, tamanho, preco, cmQuadrado, porcento+"%");
					banco.addPizza(pizza);
				}
	
				System.out.println("Deseja finalizar o cadastro? Sim(1) Nao(2)");
				menu = teclado.nextInt();
			}
			else {
				System.out.println("Pizza já cadastrada, tente novamente");
			}
			
		}
		banco.MelhorCB();
		
		System.out.println("-------------- Cardápio --------------");
		for (int i = 0; i < banco.getPizzas().length; i++) {
			System.out.println("Nome: "+banco.getPizza(i).getNome());
			System.out.println("Tamanho: "+banco.getPizza(i).getTamanho());
			System.out.println("Preço: R$"+banco.getPizza(i).getPreco());
			System.out.println("R$ p/ cm2: R$"+banco.getPizza(i).getCmQuadrado());
			System.out.println("Diferça %: "+banco.getPizza(i).getPorcento());
			System.out.println("------------------------------------");
		}
	}

}
