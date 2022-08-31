import java.util.Random; 

public class Exercicio4 {

	public static void main(String[] args) {
		//Declarando um vetor e criando uma insancia de 5 mposições
		int [] vetor = new int [5];
		//Criando uma insacia do tipo Random
		Random rand = new Random ();
		
		//Atribuir
		for (int i=0 ; i<5; i++) {
			
			vetor[i] = rand.nextInt(1000);
		}
		//conferir os dados gerados por Random
		for (int i=0; i<5; i++) {
			
			System.out.println(vetor [i]);
		}
		
		//Verificar os numeros impares e multiplicar por 10.
		for ( int i=0 ; i <5; i++) {
			
			if (vetor[i] % 2 == 1) {
				vetor [i] = vetor[i] * 10;
			}
		}
		
		//Imprimindo o valor atualizado depois da multipicação
		
		System.out.println("Vetor atualizado com as multiplicações:");
			
		for(int i=0; i<5; i++) {
			System.out.println(vetor[i]);
		}
	}

}
