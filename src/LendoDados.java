import java.util.Scanner;

public class LendoDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//As duas linhas abaixo exibem mensagem na tela
		System.out.println("Programa Educado");
		System.out.print("Por favor digite o seu nome: ");
		
		//Para ler dados a linha abaixo cria um Scanner
		Scanner leitor = new Scanner(System.in);
		
		//Para guardar dados � neces�rio criar uma vari�vel
		String nome;
		//Para ler dados e guardar na vari�vel usamos o Scanner criado
		nome = leitor.next();
		
		//A linha abaixo exhibe a mensagem com o conte�do da vari�vel
		System.out.println("Seja Bem vindo(a) " + nome);
		leitor.close();	
	}
}
