package exemplos;

import java.util.ArrayList;

public class Exemplosarrey {
	
	public static void main(String[] args) {
		
		ArrayList<Carro> lista =new ArrayList<Carro>();
		 
		lista.add(new Carro (4,"IZF1E44","CINZA",false));
		lista.add(new Carro (3,"IZF1604","branco",true));
		
		for (int i = 0; i < lista.size(); i++) {
			
		System.out.println("Placa: "+lista.get(i).getPlaca());
			
		}
		
	}

}
