package pacote;

public class Pizza {

	private String nome;
	private double tamanho;
	private double preco;
	private double cmQuadrado;
	private String porcento;
	
	public Pizza(String nome, double tamanho, double preco, double cmQuadrado, String porcento) {
		setNome(nome);
		setTamanho(tamanho);
		setPreco(preco);
		setCmQuadrado(cmQuadrado);
		SetPorcento(porcento);
	}
	
	
	//-----------------------------------------------------------------------------------------------
	
	public String getNome() {
		return nome;
	}
	public double getTamanho() {
		return tamanho;
	}
	public double getPreco() {
		return preco;
	}
	public double getCmQuadrado() {
		return cmQuadrado;
	}
	public String getPorcento() {
		return porcento;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void setCmQuadrado(double cmQuadrado) {
		this.cmQuadrado = cmQuadrado;
	}
	public void SetPorcento(String porcento) {
		this.porcento = porcento;
	}
	
	//-----------------------------------------------------------------------------------------------
	
	 
	
}
