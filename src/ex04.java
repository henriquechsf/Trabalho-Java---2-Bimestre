import java.util.Scanner;

// Solicitar a quantidade de trabalhadores
// ler a idade
// ler sexo (validar M/F utilizando while)
// ler salário de cada trabalhador
// Ao final informe: 
// 		A média de salário da empresa
//		A média de idade da empresa
//		Maior salario masculino
//		Maior salario feminino

public class ex04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int quantTrab, idade;		
		float salario, mediaSalario = 0, mediaIdade = 0;
		float maiorSalarioM = 0, maiorSalarioF = 0;
		String sexo;
		
		System.out.println("Quantidade de trabalhadores: ");
		quantTrab = leia.nextInt();
		//leitura da quantidade de trabalhadores
		
		for (int cont = 0; cont < quantTrab; cont++) {			
			System.out.println("Idade: ");
			idade = leia.nextInt();			
			
			//do{
				System.out.println("Sexo [M/F]: ");
				sexo = leia.next();			
			//}while(!sexo.equals("m") || !sexo.equals("f"));
			
			System.out.println("Salário: ");
			salario = leia.nextFloat();
			//leitura dos dados (idade, sexo, salário)
			
			mediaSalario += salario;
			mediaIdade += idade;
			//soma mediaSalario e mediaIdade
			
			if(sexo.equals("m")) {
				if(maiorSalarioM < salario) {
					maiorSalarioM = salario;
				}
			}
			else{
				if(maiorSalarioF < salario) {
					maiorSalarioF = salario;
				}
			}//condicional para armazenar o maior salário
			
		}
		
		mediaSalario = mediaSalario / quantTrab;
		mediaIdade = mediaIdade / quantTrab;
		//calcula a média de salário e idade
		
		System.out.println("Média de salário da empresa: R$ " + mediaSalario);
		System.out.println("Média de idade da empresa: " + mediaIdade);
		System.out.println("Maior salário masculino: R$ " + maiorSalarioM);
		System.out.println("Maior salário feminino: R$ " + maiorSalarioF);
		//imprime na tela
	}

}
