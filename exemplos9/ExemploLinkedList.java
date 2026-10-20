package exemplos;

import java.util.LinkedList;

public class ExemploLinkedList {
	
	public static void main(String[] args) {
		LinkedList<Impressao> lista= new LinkedList <Impressao>();
		
		lista.addLast(new Impressao("doc1.txt", 100));
		lista.addLast(new Impressao("doc2.txt", 80));
		lista.addLast(new Impressao("doc3.txt", 50));
		
		lista.removeFirst();
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).getNomeDoc());
			
		}
		
	}

}
