import java.util.Scanner;

public class LendoDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//As duas linhas abaixo exibem mensagem na tela
		System.out.println("Programa Educado");
		System.out.print("Por favor digite o seu nome: ");
		
		//Para ler dados a linha abaixo cria um Scanner
		Scanner leitor = new Scanner(System.in);
		
		//Para guardar dados é necesário criar uma variável
		String nome;
		//Para ler dados e guardar na variável usamos o Scanner criado
		nome = leitor.next();
		
		//A linha abaixo exhibe a mensagem com o conteúdo da variável
		System.out.println("Seja Bem vindo(a) " + nome);
		leitor.close();	
	}
}
