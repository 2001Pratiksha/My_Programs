package My_Package;

import java.util.Scanner;

public class compare_numbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a");
		int a = sc.nextInt();
		System.out.println("Enter b");
		int b = sc.nextInt();
		System.out.println("Enter c");
		int c = sc.nextInt();
		if (a > b && a > c) {
			System.out.println("a is grater");
		} else {
			if (b > a && b > c) {
				System.out.println("b is grater");
			} else {
				if (c > a && c > b) {
					System.out.println("c is grater");
				} else {
					if (a == b && a > c) {
						System.out.println("a and b are equal and grater");
					}

					else {
						if (b == c && b < a) {
							System.out.println("c and b are equal and a is grater");
						} else

						{
							if (a == c && a > b) {
								System.out.println("a and c are equal and grater");
							}

							else {
								if (a == b && b == c && a == c) {
									System.out.println("all are equal hence comparision is not possible");
								}
							}
						}
					}
				}
			}
		}
	}
}


}
