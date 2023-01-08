package test_01;

import java.util.Scanner;

public class Main09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int king = sc.nextInt();
		int queen = sc.nextInt();
		int look = sc.nextInt();
		int bs = sc.nextInt();
		int nt = sc.nextInt();
		int pon = sc.nextInt();
		
		System.out.println(1-king);
		System.out.println(1-queen);
		System.out.println(2-look);
		System.out.println(2-bs);
		System.out.println(2-nt);
		System.out.println(8-pon);

		sc.close();
	}

}
