import java.util.Scanner;

// Calcular o pre�o de uma viagem
// ler a distancia em km
// ler pre�o do combust�vel 
// ler m�dia de consumo do ve�culo
// Ao final mostre o custo da viagem

public class ex01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float dist, preco, consumo, precoViagem;
		
		System.out.println("Dist�ncia [km]: ");
		dist = leia.nextFloat();		
		System.out.println("Pre�o do combust�vel [R$]: ");
		preco = leia.nextFloat();		
		System.out.println("M�dia de consumo [km/l]: ");
		consumo = leia.nextFloat();
		//leitura dos dados
		
		precoViagem = (dist / consumo) * preco;
		// calculo
		
		System.out.println("O pre�o da viagem �: R$ " + precoViagem);
		// imprime na tela
	}

}
