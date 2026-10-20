package exemplos;

import java.util.Scanner;

public class ExemploVetiorInt {

	public static void main(String[] args) {
		
		int [] vetInteiros= new int [10];
		
		Scanner entrada=new Scanner (System.in);
		
		for (int i = 0; i < vetInteiros.length; i++) {
			System.out.println("Informe o elemento " +i);
			vetInteiros[i]=entrada.nextInt();
			
			
		}
		System.out.println("");
		
		for (int i = 0; i < vetInteiros.length; i++) {
			System.out.println(vetInteiros[i]);
			
		}
		entrada.close();
	
	}
	
	
}
