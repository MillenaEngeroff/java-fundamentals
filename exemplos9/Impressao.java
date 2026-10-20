package exemplos;

public class Impressao {
	
	private String nomeDoc;
	private int tamArq;
	
	public Impressao(String nomeDoc, int tamArq) {
		super();
		this.nomeDoc = nomeDoc;
		this.tamArq = tamArq;
	}

	public String getNomeDoc() {
		return nomeDoc;
	}

	public void setNomeDoc(String nomeDoc) {
		this.nomeDoc = nomeDoc;
	}

	public int getTamArq() {
		return tamArq;
	}

	public void setTamArq(int tamArq) {
		this.tamArq = tamArq;
	}
	
	
	
}
