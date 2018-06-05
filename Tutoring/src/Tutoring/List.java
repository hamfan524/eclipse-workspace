package Tutoring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class List {
	
	ArrayList<Integer> intList = new ArrayList<Integer>();
	
	public List() {
		Random rand = new Random();
		
		for (int i = 0; i < 5; i++) {
			int num = rand.nextInt(10) + 1;
			intList.add(num);
			System.out.print("TEST"+(i+1)+" : ");
			System.out.print(intList.get(i) + " ");
		}
		
		System.out.println();
		System.out.println();
		
		Collections.sort(intList);    //오름차순 정렬 함수
		
		for (int i = 0; i < intList.size(); i++) {
			System.out.print(intList.get(i) + " ");			
		}
		System.out.println();
		System.out.println();
		 
		Collections.shuffle(intList);       //다시 섞는 함수
		
		for (int i = 0; i < intList.size(); i++) {
			System.out.print(intList.get(i) + " ");			
		}
		System.out.println();
		System.out.println();
		
		int tmp = 0;
		 
		 for (int i = 0; i < intList.size(); i++) {              //내림차순 알고리즘
			for (int j = i + 1; j < intList.size(); j++) {
				
				if( intList.get(i) < intList.get(j)) {
					
				tmp = intList.get(i);
				intList.set(i, intList.get(j));  
				intList.set(j, tmp);
				
				}
				
			}
			
		}
		for (int i = 0; i < intList.size(); i++) {
			System.out.print(intList.get(i) + " ");			
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new List();
	
	}
}
