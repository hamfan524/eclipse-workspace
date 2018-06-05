package Tutoring;

import java.util.Scanner;

public class Study3 {
	
	static int number1;
	static int number2;
	static int sum;
	
	
		public static void math(int num1, int num2, int sum) {
			
		number1 = num1;
		number2 = num2;
			
		if(num1 < num2) {
			sum = 0;
			for (int i = num1; i < num2; i++) {
				sum += i;
			}
			System.out.println("작은 수 부터 큰 수 사이의 합 :" +sum);	
		}
		
		else if(num2 < num1) {
			sum = 0;
			for (int i = num2; i < num1; i++) {
				sum += i;
			}
			System.out.println("작은 수 부터 큰 수 사이의 합 :" +sum);
		}
		else 
			System.out.println("작은 수 부터 큰 수 사이의 합 :" +num1);
		
		}
		

		 public static void main(String[] args) {
			 
		Scanner scan = new Scanner(System.in);
		System.out.print("두 수를 입력하시오.");
		
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
			
		math(number1, number2, 0);
		
		scan.close();
		}

}

