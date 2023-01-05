package test_01;

import java.util.Scanner;

public class Main06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);  // 몫
		System.out.println(a % b);  // 나머지
		
		sc.close();

	}

}
