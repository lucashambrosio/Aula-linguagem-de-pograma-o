import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		//Declarando um tipo Scanner e criando uma instancia do tipo.
		Scanner buscaDados = new Scanner (System.in);
		int i = 0, valorDigitado = 0 ;
		int qtdePositivos = 0;
		int qtdeNegativos = 0;
		
		
		//Interagindo com o usuário para colocar os 10 numeros 
		while (i < 10) {
			
			System.out.println("Infome um numero:");
			valorDigitado = buscaDados.nextInt();
			
			
			//Verificando se o numero digitado e positivo ou negativo
			if (valorDigitado < 0) /* Verificar se é positivo*/ {
				
				qtdeNegativos++;
				
			} else if (valorDigitado > 0) {
				qtdePositivos++;
			}
			
			i++;
		}
		
		System.out.println("Foram informados " + qtdePositivos + " Positivos");
		System.out.println("Foram informados " + qtdeNegativos + " Negativos");
						
	}

}
