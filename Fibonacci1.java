
import java.util.Scanner;

public class Fibonacci1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number to fibonacci series");
		int num = scanner.nextInt();
		
		int num1 = 0;
		int num2 = 1;
		
		System.out.println(num1);
		System.out.println(num2);
		
		while (num > 2) {
			int sum = num1 + num2;
			System.out.println(sum);
			num1 = num2;
			num2 = sum;
			num--;
			
		}
	}

}