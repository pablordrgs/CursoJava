package controle;

import java.util.Scanner;

public class For {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double somaDasNotas = 0;
		double nota = 0;
		
		for(int indice = 0; indice < 3; indice++){
			nota = scanner.nextDouble();
			somaDasNotas += nota;
		}
		scanner.close();
		System.out.printf("A m�dia � %.2f", somaDasNotas / 3);
		
		/*for(int i = 1; i <= 10; i++){
			System.out.println(i);
		}*/
	}
	

}
