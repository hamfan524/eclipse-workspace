package Tutoring;

import java.util.Scanner;
class Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%num == 0);
			System.out.println(arr[i]);
			
		}
		
		scan.close();

	}

}
