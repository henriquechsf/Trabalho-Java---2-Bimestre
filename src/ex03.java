import java.util.Scanner;

//ler 10 números
//ao final escrever na tela a multiplicação total usando WHILE

public class ex03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num, mult = 1, cont = 0;
		//variáveis
		
		while(cont < 10) {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			
			mult = (mult * num); 
			//multiplicação dos números
			
			cont++;			
		}
		
		System.out.println("Total da multiplicação: " + mult);
		//imprime na tela o total da multiplicação
	}

}
