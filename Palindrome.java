package palindrome;

import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the range:");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		System.out.println("sum of palindrome, within given range is:" + sumOfPalindromeNos(n1, n2));
	}

	public static int sumOfPalindromeNos(int n1, int n2) {
		int sum = 0;
		for (int i = n1; i <= n2; i++) {
			int r = 0, n3 = i;
			while (n3 != 0) {
				r = (r * 10) + (n3 % 10);
				n3 = n3 / 10;
			}
			// System.out.println(n3);
			if (r == i)
				sum = sum + i;
		}
		return sum;
	}
}
