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
			System.out.println("���� �� ���� ū �� ������ �� :" +sum);	
		}
		
		else if(num2 < num1) {
			sum = 0;
			for (int i = num2; i < num1; i++) {
				sum += i;
			}
			System.out.println("���� �� ���� ū �� ������ �� :" +sum);
		}
		else 
			System.out.println("���� �� ���� ū �� ������ �� :" +num1);
		
		}
		

		 public static void main(String[] args) {
			 
		Scanner scan = new Scanner(System.in);
		System.out.print("�� ���� �Է��Ͻÿ�.");
		
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
			
		math(number1, number2, 0);
		
		scan.close();
		}

}

