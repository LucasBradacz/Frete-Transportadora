package entidades;

//Classe abstrata 
//>> Herança: Van e Caminhao estendem Veiculo
public abstract class Veiculo {
	
	// >> Encapsulamento: atributos protegidos
	protected String placa;
	protected double capacidade;
	
	// >> Sobrecarga de construtor (polimorfismo estático)
	public Veiculo(String placa) {
		super();
		this.placa = placa;
	}

	public Veiculo(String placa, double capacidade) {
		super();
		this.placa = placa;
		this.capacidade = capacidade;
	}
	
	public String getPlaca() {
		return placa;
	}

	public double getCapacidade() {
		return capacidade;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}

	// Método abstrato (polimorfismo dinâmico - sobresposição)
	public abstract void frete();
	
	public abstract void mostrar();
}
