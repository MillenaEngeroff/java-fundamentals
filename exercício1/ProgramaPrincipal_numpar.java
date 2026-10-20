package exercício1;

public class ProgramaPrincipal {
	
	public static <Scanner> void main(String[] args) {
		
		int[] num = {10, 21, 30, 43, 50};
		int soma=0;
		
	
		for (int i=0; i<num.length; i++) {
			soma= soma+num[i]; 
			
			if (num[i] % 2 == 0)
			{
				System.out.println("Número par:" +num[i]);
			}
			
		}
		
		System.out.println("Soma:"+soma);
	}

}
