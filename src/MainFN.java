import java.util.Scanner;

public class MainFN {

	public static void main(String[] args) {

		int input;
		int f1 = 0;
		int f2 = 1;
		int sum = 0;
		

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Unesite broj: ");
		input = scanner.nextInt();
		
		System.out.println(f1);
		System.out.println(f2);
		
		for (int i =1; i<input; i++) {
			sum = f1+f2;
			f1 = f2;
			f2 = sum;
			System.out.println(sum);
		}
		scanner.close();
	}

}
