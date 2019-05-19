import java.util.Scanner;

// Calcular o preço de uma viagem
// ler a distancia em km
// ler preço do combustível 
// ler média de consumo do veículo
// Ao final mostre o custo da viagem

public class ex01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float dist, preco, consumo, precoViagem;
		
		System.out.println("Distância [km]: ");
		dist = leia.nextFloat();		
		System.out.println("Preço do combustível [R$]: ");
		preco = leia.nextFloat();		
		System.out.println("Média de consumo [km/l]: ");
		consumo = leia.nextFloat();
		//leitura dos dados
		
		precoViagem = (dist / consumo) * preco;
		// calculo
		
		System.out.println("O preço da viagem é: R$ " + precoViagem);
		// imprime na tela
	}

}
