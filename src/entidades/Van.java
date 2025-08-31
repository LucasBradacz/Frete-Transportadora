package entidades;

//Classe final: não pode ser herdada
public class Van extends Veiculo {

	protected final double distancia;

	public Van(String placa, double capacidade, double distancia) {
		super(placa, capacidade);
		this.distancia = distancia;
	}
	
	public Van(String placa, double capacidade) {
		super(placa, capacidade);
		this.distancia = 0.0;
	}
	
	public final double getDistancia() {
		return distancia;
	}

	// Polimorfismo dinâmico (sobresposição)
    @Override
	public final void frete() {
		if (this.getDistancia() < 100) {
			System.out.println(1000 * this.getCapacidade());
		} else {
			System.out.println("Muita distancia");
		}
	}

    @Override
	public final void mostrar() {
		System.out.println(this.getPlaca());
		System.out.println(this.getCapacidade());
		System.out.println(this.getDistancia());
		this.frete();
	}
}
