package test_01;

import java.util.Scanner;

public class Main05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 나누기는 값이 소수점이 나올 수도 있기 때문에
		// int보다는 double을 사용한다.
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		System.out.println(a / b);
		
		sc.close();

	}

}
