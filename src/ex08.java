import java.util.Scanner;

// ler o nome, nota1 e nota2 de 5 alunos
// Salvar informações em vetor
// Ao final liste o nome, nota1, nota2 e média

public class ex08 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String[] nome = new String[5];
		float[] nota1 = new float[5];
		float[] nota2 = new float[5];
		float[] media = new float[5];
		//vetores
		
		for(int cont = 0; cont < 5; cont++) {
			System.out.println("Aluno: ");
			nome[cont] = leia.next();			
			
			System.out.println("Nota 01: ");
			nota1[cont] = leia.nextFloat();			
			
			System.out.println("Nota 02: ");
			nota2[cont] = leia.nextFloat();
			//leitura dos dados (nome, nota1, nota2)
			
			media[cont] = (nota1[cont] + nota2[cont]) / 2;
			//calcula a média
		}
		
		System.out.println("====RELATÓRIO DE NOTAS=====");
		
		for(int cont = 0; cont < 5; cont++) {
			System.out.println("Aluno: " + nome[cont]);
			System.out.println("Nota 1: " + nota1[cont]);
			System.out.println("Nota 1: " + nota2[cont]);
			System.out.println("Nota 1: " + media[cont]);
			System.out.println("=======================");
		}//imprime na tela
		
	}

}
