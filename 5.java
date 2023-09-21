package guvi;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, i, count = 0;
		num = sc.nextInt();
		for (i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
				break;
			}
		}

		if (count == 0) {
			System.out.println(num + " is a prime");
		} else {
			System.out.println(num + " is not a prime");
	}

	}