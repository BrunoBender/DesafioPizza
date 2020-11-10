package pacote;

public class Banco {
	
	private Pizza[] pizza = new Pizza[1];
	private double melhorCB;
	
	public double getMelhorCB() {
		return melhorCB;
	}
	
	public void setMelhorCB(double melhorCB) {
		this.melhorCB = melhorCB;
	}
	
	public Pizza[] getPizzas() {
		return pizza;
	}
	
	public Pizza getPizza(int i) {
		return pizza[i];
	}
	
	public void addPizza(Pizza pizza) {
		int i;
		
		for (i = 0; i < this.pizza.length; i++) {
			if (this.pizza[i] == null) {
				this.pizza[i] = pizza;
				break;
			}
		}
		
		if(i == this.pizza.length) {
			this.pizza = novaPizza(this.pizza);
			this.pizza[i] = pizza;
		}
	}
	
	public Pizza[] novaPizza(Pizza[] pizza) {
		Pizza[] novaPizza = new Pizza[this.pizza.length + 1];
		for (int i = 0; i < pizza.length; i++) {
			novaPizza[i] = pizza[i];
		}
		
		return novaPizza;
		
	}
	
	public boolean testeTamanho(double tamanho) {
		
		for (int i = 0; i < this.pizza.length; i++) {
			if (pizza[0] == null) {
				return true;
			}
			else if (this.pizza[i].getTamanho() == tamanho) {
				return false;
			}
		}
		return true;
	}
	
	public double calcCmQuadrado(double tamanho, double preco) {
		double area = 3.14d * ((tamanho/2)*(tamanho/2));
		double cmQuadrado = preco/area;
		
		return cmQuadrado;
	}
	
	public double getPorcento(double cmQuadrado) {
		
		if (pizza[0] == null) {
			setMelhorCB(cmQuadrado);
		}
		else if (cmQuadrado<getMelhorCB()) {
			setMelhorCB(cmQuadrado);
		}
		
		double porcento = ((100 * cmQuadrado) / getMelhorCB())-100;  
		
		return porcento;
		
	}
	
	public int getIPizza(double tamanho) {
		for (int i = 0; i < pizza.length; i++) {
			if (pizza[i].getTamanho() == tamanho) {
				return i;
			}
		}
		return 0;
	}
	
	public void MelhorCB() {
		for (int j = 0; j < pizza.length; j++) {
			for (int i = j+1; i < pizza.length; i++) {
				if (pizza[i].getPorcento().equals("Melhor CB")) {
					pizza[j].SetPorcento(((100 * pizza[j].getCmQuadrado()) / getMelhorCB())-100+"%");
				}
			}
		}
		
	}
}
