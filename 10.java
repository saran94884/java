package guvi;

import java.util.Scanner;

public class Countint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0, n = sc.nextInt();
		while (n != 0) {
			n /= 10;
			count++;
		}
		System.out.println(count);
	}
}
