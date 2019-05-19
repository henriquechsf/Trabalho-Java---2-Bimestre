import java.util.Scanner;

// leia um numero 
// calcule o fatorial. ex: 4: 4*3*2*1

public class ex06 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int num = 0, fatorial = 1;		
		
		System.out.println("Digite um número: ");
		num = leia.nextInt();
		//leitura do número
		
		for(num = num; num > 1; num--) {
			fatorial = fatorial * num;
		}//calcula o fatorial
		
		System.out.println("Fatorial: " + fatorial);
		//imprime na tela
	}

}
