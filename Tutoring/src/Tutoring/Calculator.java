package Tutoring;

import java.util.Scanner;

public class Calculator {
	int a, b;
	String c;
	
	void setValues(int a, int b, String c) {
		this.a = a;
		this.b = b;
		this.c = c;
		Calc();
	}
	
	int Calc() {

		switch (c) {
		case "+":
			return add();
		case "-":
			return sub();
		case "*":
			return mul();
		case "/":
			return div();
		default:
			System.out.print("잘못 입력 하였습니다.");
		}
		return 0;
	}
	int add() {
		System.out.println(a + b);
		return a + b;
	}
		
	int sub() {
		System.out.println(a - b);
		return a - b;
	}
	
	int mul() {
		System.out.println(a * b);
		return a * b;
	}
	
	int div() {
		System.out.println(a / b);
		return a / b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator s1 = new  Calculator();
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 두개 입력,  연산자 입력 : ");
		s1.setValues(scan.nextInt(), scan.nextInt(), scan.next());
		
	
		scan.close();
		
	}

}
