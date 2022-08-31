import java.util.Random;


public class Exercicio7 {

	public static void main(String[] args) {
		//Declarando uma matriz do tipo int e criando uma instancia 
		//Tamanho 2 linhas e 5 colunas
		int[][] matriz = new int [2][5];
		Random rand = new Random(1000);
		
		//Criando o vetor com 10 posções na matriz
		int [] vetor = new int [10];
		
		//Percorrendo as linhas e colunas
		for (int i= 0; i<2 ; i++) {
			for (int j=0; j<5 ; j++) {
				
				matriz[i][j]= rand.nextInt();
				
			}
			
		}
		
		System.out.println("Imprimindo os valores da matriz");
		
		for (int i=0; i<2 ; i++) {
			for (int j=0; j<5; j++) {
				System.out.println(matriz [i][j]);
			}
		}
		
		//Colocando a matriz dentro do vetor com o nome contador
		
		int contador = 0;
		
		for (int i = 0; i<2 ; i++) {
			for(int j=0; j<5; j++) {
				
				vetor [contador] = matriz [i][j];
				contador++;
			}
		}
		
		System.out.println("Dados do vetor");
		for (int i = 0; i<10; i++) {
			System.out.println(vetor[i]);
		}
		

	}

}
