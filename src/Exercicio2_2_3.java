import java.util.Locale;
import java.util.Scanner;


	public class Exercicio2_2_3 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			Circulo circulo = new Circulo();
			
			System.out.printf("Digite o raio do círculo: ");
			circulo.raio = sc.nextDouble();
			
			double area = circulo.calculaArea();
			double circunferencia = circulo.calculaCircunferencia();
			
			System.out.printf("Área do círculo: %.2f.\n",area);
			System.out.printf("Circunferência do círculo: %.2f.\n",circunferencia);
			
			sc.close();
		}
		
	}

	class Circulo {
		double raio;

		public double calculaArea() {
			return 3.14*raio*raio;
		}
		
		public double calculaCircunferencia() {
			return 3.14*raio*2;
		}
	}