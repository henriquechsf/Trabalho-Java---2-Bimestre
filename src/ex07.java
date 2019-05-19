import java.util.Scanner;

// leia a quantidade de alunos
// leia nome, nota1 e nota2
// calcule a média do aluno
// liste o nome, nota1, nota2 e média do aluno
// Ao final liste a média da turma

public class ex07 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float mediaAluno, mediaTurma = 0;
				
		System.out.println("Quantidade de alunos: ");
		int quant = leia.nextInt();
		//le a quantidade de alunos
		
		for(int cont = 0; cont < quant; cont++) {
			System.out.println("Nome do aluno: ");
			String nome = leia.next();	
			
			System.out.println("Nota 1: ");
			float nota1 = leia.nextFloat();	
			
			System.out.println("Nota 2: ");
			float nota2 = leia.nextFloat();
			//leitura dos dados (nome, nota1, nota2)
		
			mediaAluno = (nota1 + nota2) / 2;
			//calcula a média do aluno
			
			mediaTurma += mediaAluno;
			//soma a média da turma
			
			System.out.println("Nome: " + nome);
			System.out.println("Nota 01: " + nota1);
			System.out.println("Nota 02: " + nota2);
			System.out.println("Média do aluno: " + mediaAluno);
			//imprime os dados na tela						
		}
		
		mediaTurma = (mediaTurma / quant);
		//calcula a média da turma
		
		System.out.println("=============================");
		System.out.println("Média da turma: " + mediaTurma);
		//imprime na tela
	}

}
