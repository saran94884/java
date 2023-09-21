package guvi;

import java.util.Scanner;

public class Stringlength {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String g = sc.next();
		int i = 0;
		for (char c : g.toCharArray()) {
			i++;
		}
		System.out.print(i);
	}
}
