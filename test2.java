package Examples;
import java.util.Scanner;

/**
 * @author sivak
 *
 */
public class PrintExample {
	
 public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		// int[] arr = {};
		int testcases = sc.nextInt();
		// for (int i = 0; i < testcases; i++) {
		// int a = sc.nextInt();
		// arr[i] = a;
		// }
		int a = sc.nextInt();
		int b = sc.nextInt();
		// System.out.println(a);
		// System.out.println(b);
		for (int j = 1; j <= b; j++) {
			if (j % 3 == 0) {
				System.out.println("FIZZ");
			} else if (j % 5 == 0) {
				System.out.println("BUZZ");
			} else if (j % 3 == 0 && j % 5 == 0) {
				System.out.println("FIZZBUZZ");

			} else
				System.out.println(j);
		}
	}

}
