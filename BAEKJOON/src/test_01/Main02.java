package test_01;

import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a + b);
		
		// Scanner 닫기.
		sc.close();

	}

}
