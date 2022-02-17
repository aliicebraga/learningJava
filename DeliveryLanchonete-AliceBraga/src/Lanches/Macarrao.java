package Lanches;

import java.util.Scanner;

public class Macarrao extends Massa implements MacarraoInterface {

	//////// atributos do Macarrao
	private String tipoMassa;

	/////// constructor
	public Macarrao() {
//		System.out.println("Você escolheu macarrão!");
		this.fazerMacarrao();
		
	}

	///////// rotina para fazer o macarrao, chama os outros métodos
	public void fazerMacarrao() {
		this.escolherTipoMassa();
		super.escolherMolho();
		System.out.println("Você escolheu um macarrão de massa " + getTipoMassa() + " e " + getMolho());
   	 	System.out.println("----------------------------------------------------------------------------------------------------------- ");
		super.fecharPedido();
	}
	
	///////// método para escolher o tipo de massa do macarrao	
	@Override
	public void escolherTipoMassa() {
		int escolhaDoTipoMassa;
		Scanner ler = new Scanner(System.in);

		System.out.println("--------------- Tipos de macarrão a escolher ---------------");
		System.out.println(" ");
		System.out.println("			[ 1 ] - Talaharim ...... R$ 28,40");
		System.out.println("			[ 2 ] - Pene ........... R$ 36,70");
		System.out.println("			[ 3 ] - Parafuso ....... R$ 39,00");
		System.out.println("Escolha a opção desejada:");
		System.out.println("  ");
		
		escolhaDoTipoMassa = ler.nextInt();

		switch (escolhaDoTipoMassa) {
		case 1:
			this.setTipoMassa("Talharim");
			super.setPreco(28.40);

			break;
		case 2:
			this.setTipoMassa("Pene");
			super.setPreco(36.70);
			break;
		case 3:
			this.setTipoMassa("Parafuso");
			this.setPreco(39.00);
			break;

		default:
			System.out.println("Número inválido");
		}
		
	}

	
	////////////// getters and setters
	public String getTipoMassa() {
		return tipoMassa;
	}

	public void setTipoMassa(String tipoMassa) {
		this.tipoMassa = tipoMassa;
	}

}
