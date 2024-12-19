package comm;

import java.util.Scanner;

public class Pattern6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Taking user input for the number of rows
		System.out.print("Enter a number: ");
		int n = scanner.nextInt();
		for(int i=1;i<=n;i++) 
		{
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
}
}
