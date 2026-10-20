package exemplos;

public class Carro {
	
	private int numPortas;
	private String placa,cor;
	private boolean vidroEletrico;
	
	public Carro(int numPortas, String placa, String cor, boolean vidroEletrico) {
		super();
		this.numPortas = numPortas;
		this.placa = placa;
		this.cor = cor;
		this.vidroEletrico = vidroEletrico;
	}

	public int getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isVidroEletrico() {
		return vidroEletrico;
	}

	public void setVidroEletrico(boolean vidroEletrico) {
		this.vidroEletrico = vidroEletrico;
	}
	
	
	
	
}
