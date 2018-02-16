import java.util.Scanner;

public class Exercicio5 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite a primeira palavra por favor: ");
		String palavra1 = sc.next();
		System.out.printf("Digite a segunda palavra por favor: ");
		String palavra2 = sc.next();
		if (palavra1.equals(palavra2))
			System.out.println("as duas palavras são Iguais");
		else
			System.out.println("as duas palavras são Diferentes");
		
		sc.close();
	}
}