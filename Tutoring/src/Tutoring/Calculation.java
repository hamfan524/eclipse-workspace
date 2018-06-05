package Tutoring;

import java.util.Scanner;

class Add extends Calculation {
	int num1, num2;
	public Add() {
		super.setValue();
		this.num1 = super.getNum1();
		this.num2 = super.getNum2();
		System.out.println("결과 : " + (num1 + num2));
		
	}
}
	
class Sub extends Calculation {
	int num1, num2;
	public Sub() {
		super.setValue();
		this.num1 = super.getNum1();
		this.num2 = super.getNum2();
		System.out.println("결과 : " + (num1 - num2));
	}
}
	
class Mul extends Calculation{
	int num1, num2;
	public Mul() {
		super.setValue();
		this.num1 = super.getNum1();
		this.num2 = super.getNum2();
		System.out.println("결과 : " + (num1 * num2));
	}
}

class Div extends Calculation{
	int num1, num2;
	public Div() {
		super.setValue();
		this.num1 = super.getNum1();
		this.num2 = super.getNum2();
		System.out.println("결과 : " + (num1 / num2));
	}
}

public class Calculation {
	
	private int num1;
	private int num2;
	public Calculation() {
	}
	public void setValue() {
		Scanner scan = new Scanner(System.in);
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		scan.close();
	}
	public int getNum1() {
		return num1;
	}
	
	public int getNum2() {
		return num2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation sub = new Sub();

	}

}
