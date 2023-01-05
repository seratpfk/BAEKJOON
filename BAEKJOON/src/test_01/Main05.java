package test_01;

import java.util.Scanner;

public class Main05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 나누기의 값이 소수점인 경우도 있다.
		// 따라서 int보다는 double을 사용하기.
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		System.out.println(a / b);
		
		sc.close();

	}

}
