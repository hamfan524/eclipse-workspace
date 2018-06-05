package Tutoring;

import java.util.Scanner;

class Study2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a, b;
		
		a = scan.nextInt();
		b = scan.nextInt();
		int sum = 0;
		for( int i = a; i <= b; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		scan.close();
	}

}
