
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Massa nhoque = new Massa("Alice", 001, "Nhoque");
//		Massa penne = new Massa("Alice", 001, "Penne");
		
		Sanduiche sanduba1 = new Sanduiche("Alice", 127);
//		sanduba1.dados();
		sanduba1.adicionarIngrediente();
		sanduba1.adicionarIngrediente();
		sanduba1.adicionarIngrediente();
		sanduba1.adicionarIngrediente();
		System.out.println("----------------------" );
//		sanduba1.dados();
		
		Salada fit = new Salada("Alice", 127);
//		fit.dados();
		fit.adicionarIngrediente();
		fit.adicionarIngrediente();
		fit.adicionarIngrediente();
		fit.adicionarIngrediente();
		System.out.println("----------------------" );
		
		fit.dados();
	}

}
