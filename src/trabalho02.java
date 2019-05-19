import java.util.Scanner;

// ler o nome do aluno
// ler nota total dos trabalhos
// ler nota prova1 e prova2
// media avaliação = se nota prova1 > nota prova2 entao nota1 + nota2 / 2
// 		senao nota1 é desconsiderada e media = nota prova2
// Nota final = se a media das avaliações >= 6 entao mediaProvas * 0.75 + notaTrabalhos * 0.25
//		senao media avaliações = mediaProvas * 0.75
// Ao final determinar o conceito de A até E.

public class trabalho02 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double mediaProvas = 0, notaFinal = 0;
		
		System.out.println("Nome do aluno: ");
		String nome = leia.next();		
		System.out.println("Nota total dos trabalhos: ");
		float notaTrabalhos = leia.nextFloat();		
		System.out.println("Nota da prova 1: ");
		float notaProva1 = leia.nextFloat();		
		System.out.println("Nota da prova 2: ");
		float notaProva2 = leia.nextFloat();
		// leitura dos dados
		
		if(notaProva1 > notaProva2) {
			mediaProvas = (notaProva1 + notaProva2) / 2;
		}else {
			mediaProvas = notaProva2;
		} // condicional p/ calculo da media das avaliações
		
		if(mediaProvas >= 6) {
			notaFinal = ((mediaProvas * 0.75) + (notaTrabalhos * 0.25));
		}else {
			notaFinal = (mediaProvas * 0.75);
		} //condicional p/ calculo da nota final
		
		System.out.println("Aluno: " + nome);
		System.out.println("Nota Final: " + notaFinal);
		
		if(notaFinal >= 8.5) {
			System.out.println("Conceito A");
		}else
			if(notaFinal >= 7) {
				System.out.println("Conceito B");
			}else
				if(notaFinal >= 6) {
					System.out.println("Conceito C");
				}else
					if(notaFinal >= 1) {
						System.out.println("Conceito D");
					}else {
						System.out.println("Conceito E");
					} //condicional p/ definir o conceito (A até E)
				
	}
}
