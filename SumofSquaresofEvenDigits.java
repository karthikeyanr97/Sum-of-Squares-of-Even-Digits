import java.util.Scanner;

public class SumofSquaresofEvenDigits extends UserCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the integer number:");
		int number = scanner.nextInt();
		int result = sumOfSquaresOfEvenDigits(number);
		System.out.println(result);

		scanner.close();
	}
}

class UserCode {
	public static int sumOfSquaresOfEvenDigits(int number) {

		int sum = 0;

		while (number > 0) {
			int remainder = number % 10;
			if (remainder % 2 == 0) {
				sum += (remainder * remainder);
			}
			number /= 10;
		}

		return sum;

	}
}
