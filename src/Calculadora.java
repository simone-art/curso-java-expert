import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Programa Calculadora");
		Scanner leitor = new Scanner(System.in);
		
		int valor1;
		int valor2;
		int soma;
		int subtracao;
		
		
		System.out.println("Por favor digite o seu primeiro n�mero: ");
		valor1 = leitor.nextInt();
		
		System.out.println("Por favor digite o seu segundo n�mero: ");
		valor2 = leitor.nextInt();
		
		soma = valor1 + valor2;
		subtracao = valor1 - valor2;
		
		System.out.println("O valor da soma �: " + soma);
		System.out.println("O valor da subtrac�o �: " + subtracao);
		
		
	}

}
