package questao1;

public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		
		
		Produto obj1 = new Produto (15,"15555", 20);
		obj1.setPreco(30);
		
		System.out.println("Id do produto: "+obj1.getId());
		System.out.println("Nome do produto: "+obj1.getNome());
		System.out.println("Nome do preco: "+obj1.getPreco());
		
		
		
		
	}

}
