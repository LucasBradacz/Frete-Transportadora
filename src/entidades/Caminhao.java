package entidades;

//Classe final: não pode ser herdada
public class Caminhao extends Veiculo {
	
	protected final double distancia;

	public Caminhao(String placa, double capacidade, double distancia) {
		super(placa, capacidade);
		this.distancia = distancia;
	}

	public Caminhao(String placa, double capacidade) {
		super(placa, capacidade);
		this.distancia = 0.0;
	}
	
	public final double getDistancia() {
		return distancia;
	}
	
	@Override
	public final void frete() {
		if (this.getDistancia() >= 100) {
			double custo = ((800 * this.getCapacidade()) * (this.getDistancia() / 100.0)) + 500;
			System.out.println(custo);
		} else {
			System.out.println("Ta de sacanagem");
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
