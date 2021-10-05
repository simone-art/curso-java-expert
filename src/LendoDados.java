import java.util.Scanner;

public class LendoDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Programa Educado");
		System.out.println("Por favor digite o seu nome: ");
		
		Scanner leitor = new Scanner(System.in);
		String nome;
		nome = leitor.next();
		
		System.out.println("Seja Bem vindo(a) " + nome);
		leitor.close();
			
	}
}
