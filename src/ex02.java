import java.util.Scanner;

// ler 10 números
// ao final escrever na tela a soma total usando FOR

public class ex02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int num, soma = 0;
		
		for (int cont = 0; cont < 10; cont++) {			
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			//leitura dos números
			
			soma += num;
			//soma dos números		
		}
		
		System.out.println("Total da soma: " + soma);
		// imprime na tela
		
	}

}
