import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		ArrayList<String> cores = new ArrayList<>();
		
		numeros.add(13);
		numeros.add(27);
		numeros.add(52);
		numeros.add(03);
		numeros.add(14);
		
		System.out.println(numeros.get(2));
		
//		acrescenta o numero 89 na posição 2
		numeros.add(2,89);
		
		for(int n:numeros) {
			System.out.println(n);
		}
		
		cores.add("Laranja");
		cores.add("Verde");
		cores.add("Azul");
		
		cores.add(0,"Roxo");
		
		for(String n:cores) {
			System.out.println(n);
		}
		//limpa o array
//		cores.clear();
		//remove um elemento de uma posição específica
		System.out.println(cores.remove(0));
		//pega o tamanho do array
		System.out.println(cores.size());
		System.out.println(cores.indexOf("Azul"));
		System.out.println(cores.indexOf("Vermelho"));
		
		
		///////////// tratamento de erro
		///// sempre que houver uma operação crítica (possivel de erro), devemos tratar o possível erro
		
//		try {
//			System.out.println(numeros.get(13));
//		} catch(Exception e){
//			System.out.println("Erro: " + e);
//			System.err.println(e.getMessage());
//		}
		
		try {
			System.out.println(numeros.get(13));
		} catch(IndexOutOfBoundsException e){
			System.out.println("Erro de índice inexistente.");
		} catch(Exception e){
			System.out.println("Erro: " + e);
		} finally {
			System.out.println("Fim do try.");
		}
		
		int nota = 60;
		if (nota > 50) {
			throw new IllegalArgumentException("Valor de nota inválida");
		}
		
		
		
	}

}
