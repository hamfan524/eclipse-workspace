package Tutoring;

import java.util.Scanner;

public class Car {
	static boolean Start;
	static boolean Standard;
	static boolean Break;
	static int Speed;
	
	public static void Check(boolean onOff) {
		
		if(onOff == true)
			System.out.print("���� �õ��� �����ְ� ");
		
		else
			System.out.print("���� �õ��� �����ְ� ");		
		
	}
	public static void Proceed(boolean proceed) {
		if(proceed == true)
			System.out.print("�������̴�.");
		
	}
	
	public static void Stop(boolean stop) {
		if(stop == true) {
			System.out.print("�극��ũ�� �� ���� ������ ");
		}
		else
			System.out.print("�극��ũ�� �ɷ��ִ�.");
	}
	
	
	public static void Scalar(int speed) {
		if (speed != 0)
			System.out.print("�ü� "+speed+"km�̸� ");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("���� �õ�, �������, �극��ũ, �ӷ��� �Է��Ͻÿ� : ");
		Scanner scan = new Scanner( System.in );
		
		boolean Start = scan.nextBoolean();
		boolean Standard = scan.nextBoolean();
		boolean Break = scan.nextBoolean();
		int Speed = scan.nextInt();
		
		Check(Start);
		Stop(Break);
		Scalar(Speed);
		Proceed(Standard);
			
		scan.close();

	}

}
