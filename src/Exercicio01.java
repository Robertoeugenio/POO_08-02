import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Casa casa = new Casa();
		
		casa.proprietario.nome = sc.next();
	
		casa.endereco.logradouro = sc.next();
		
		casa.endereco.numero = sc.next();

		casa.endereco.cidade = sc.next();
	
		casa.endereco.estado = sc.next();
	
		casa.endereco.cep = sc.next();
		
		
		System.out.printf("Nome",casa.proprietario.nome);
		System.out.printf("Logradouro",casa.endereco.logradouro);
		System.out.printf("Número",casa.endereco.numero);
		System.out.printf("Cidade",casa.endereco.cidade);
		System.out.printf("Estado",casa.endereco.estado);
		System.out.printf("CEP",casa.endereco.cep);
		
		sc.close();
	}
}

class Pessoa {
	String nome;
}

class Endereco {
	String logradouro;
	String numero;
	String cidade;
	String estado;
	String cep;
}

class Casa {
	Pessoa proprietario = new Pessoa();
	Endereco endereco = new Endereco();
}