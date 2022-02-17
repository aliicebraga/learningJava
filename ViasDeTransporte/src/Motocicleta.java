
public class Motocicleta extends Motorizado{

	private boolean partidaEletrica;
	
	public Motocicleta(String marca, String modelo, double valor) {
		super(marca, modelo, valor);
		this.setTipoCarteira("A");
		this.setPotencia(13);
	}
	
	public void informarPartida() {
		this.partidaEletrica = true;
	}
	
	public void dados() {
		System.out.println("--------------MOTOCICLETA--------------");
		super.dados();
		System.out.printf("Tipo da Carteira: %s.%n", this.getTipoCarteira());
		System.out.printf("Tem partida elétrica? %s%n", (this.isPartidaEletrica()? "Sim.": "Não."));
	
	}

	public boolean isPartidaEletrica() {
		return partidaEletrica;
	}

}
