package Tutoring;

import java.util.Scanner;

public class Car {
	static boolean Start;
	static boolean Standard;
	static boolean Break;
	static int Speed;
	
	public static void Check(boolean onOff) {
		
		if(onOff == true)
			System.out.print("차에 시동이 켜져있고 ");
		
		else
			System.out.print("차에 시동이 꺼져있고 ");		
		
	}
	public static void Proceed(boolean proceed) {
		if(proceed == true)
			System.out.print("전진중이다.");
		
	}
	
	public static void Stop(boolean stop) {
		if(stop == true) {
			System.out.print("브레이크가 안 잡혀 있으며 ");
		}
		else
			System.out.print("브레이크가 걸려있다.");
	}
	
	
	public static void Scalar(int speed) {
		if (speed != 0)
			System.out.print("시속 "+speed+"km이며 ");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("차의 시동, 진행방향, 브레이크, 속력을 입력하시오 : ");
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
