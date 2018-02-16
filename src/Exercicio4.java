import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String palavra = sc.nextLine();
		palavra = palavra.toUpperCase();
		System.out.println ("palavra maiúscula:" + palavra);
		sc.close();
	}
}