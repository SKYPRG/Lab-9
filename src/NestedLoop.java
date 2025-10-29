import java.util.Scanner;

public class NestedLoop {
	public static void main(String[] args) {
		int n = 0;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter value of n: ");
		n = input.nextInt();
		if (n < 1) {
			System.out.print("Don\'t Enter Negative Numbers");
			return;
		}

		System.out.println("The Multiplaction Tables of first " + n + " numbers are");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print((i * j) + "\t");
			}
			System.out.println();
		}

	}
}
