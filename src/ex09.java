import java.util.Scanner;

// ler o nome e idade de 3 pessoas
// salvar em um vetor
// Ao final mostre o nome, a idade
// se é maior ou menor de idade

public class ex09 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String[] nome = new String[3];
		int[] idade = new int[3];
		//vetores
		
		for(int cont = 0; cont < 3; cont++) {
			System.out.println("Digite o nome: ");
			nome[cont] = leia.next();
			
			System.out.println("Qual a idade: ");
			idade[cont] = leia.nextInt();
		}//leitura dos dados (nome, idade)
		
		System.out.println("=====RELATÓRIO=====");
		
		for(int cont = 0; cont < 3; cont++) {
			System.out.println("Nome: " + nome[cont]);
			System.out.println("Idade: " + idade[cont]);
			
			if(idade[cont] >= 18) {
				System.out.println("Maior de idade");
			}else {
				System.out.println("Menor de idade");
			}//condicional Maior ou Menor de idade
			
			System.out.println("====================");
		}//imprime na tela
		
	}
}
