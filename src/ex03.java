import java.util.Scanner;

//ler 10 n�meros
//ao final escrever na tela a multiplica��o total usando WHILE

public class ex03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num, mult = 1, cont = 0;
		//vari�veis
		
		while(cont < 10) {
			System.out.println("Digite um n�mero: ");
			num = leia.nextInt();
			
			mult = (mult * num); 
			//multiplica��o dos n�meros
			
			cont++;			
		}
		
		System.out.println("Total da multiplica��o: " + mult);
		//imprime na tela o total da multiplica��o
	}

}
