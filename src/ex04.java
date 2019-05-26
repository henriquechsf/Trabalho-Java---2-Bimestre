import java.util.Scanner;

// Solicitar a quantidade de trabalhadores
// ler a idade
// ler sexo (validar M/F utilizando while)
// ler sal�rio de cada trabalhador
// Ao final informe: 
// 		A m�dia de sal�rio da empresa
//		A m�dia de idade da empresa
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
			
			System.out.println("Sal�rio: ");
			salario = leia.nextFloat();
			//leitura dos dados (idade, sexo, sal�rio)
			
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
			}//condicional para armazenar o maior sal�rio
			
		}
		
		mediaSalario = mediaSalario / quantTrab;
		mediaIdade = mediaIdade / quantTrab;
		//calcula a m�dia de sal�rio e idade
		
		System.out.println("M�dia de sal�rio da empresa: R$ " + mediaSalario);
		System.out.println("M�dia de idade da empresa: " + mediaIdade);
		System.out.println("Maior sal�rio masculino: R$ " + maiorSalarioM);
		System.out.println("Maior sal�rio feminino: R$ " + maiorSalarioF);
		//imprime na tela
	}

}
