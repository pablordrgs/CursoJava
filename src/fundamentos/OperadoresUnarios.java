package fundamentos;

public class OperadoresUnarios {
	
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		
		//incremento e decremento
		num1++;
		System.out.println(num1);
		--num1;
		System.out.println(num1);
		
		System.out.println(++num1 == num2--);
		System.out.println(num1);
		System.out.println(num2);
		
		//complemento bin�rio
		System.out.println(Integer.toBinaryString(50));
		System.out.println(Integer.toBinaryString(~50));
		
		//nega��o l�gica
		System.out.println(!true);
	}

}
