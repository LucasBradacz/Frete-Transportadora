package entidades;

import java.util.ArrayList;


public class App {

	public static void main(String[] args) {

		ArrayList<Veiculo> frota = new ArrayList<>();

		frota.add(new Caminhao("ABC-1234", 10, 200)); 
		frota.add(new Caminhao("DEF-5678", 5, 150)); 
		frota.add(new Caminhao("GHI-9012", 8, 300)); 

		frota.add(new Van("JKL-3456", 1.5, 180)); 
		frota.add(new Van("MNO-7890", 2, 50)); 
		frota.add(new Van("PQR-2468", 3, 90)); 

		for (Veiculo v : frota) {
			System.out.println("------------------------------");
			v.mostrar();
		}
	}
}