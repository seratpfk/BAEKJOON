package test_02;

import java.util.Scanner;

public class Main03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		// if문의 조건이 여러개일 때, &&는 그리고 ||는 또는을 나타낸다.
		if (((year % 4) == 0) && ((year % 100) != 0) || ((year % 400) == 0)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

}
