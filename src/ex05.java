import java.util.Scanner;

// ler a base de 05 triangulos
// mostra a area de cada um
// formula area = (base * altura) / 2

public class ex05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		float base, altura, area;
		
		for(int cont=0; cont < 5; cont++) {
			System.out.println("Digite a base: ");
			base = leia.nextFloat();			
			System.out.println("Digite a altura: ");
			altura = leia.nextFloat();
			//leitura dos dados
			
			area = (base * altura) / 2;
			// calcula a area
			
			System.out.println("A área do triângulo é: " + area);
			// imprime na tela
		}

	}

}
