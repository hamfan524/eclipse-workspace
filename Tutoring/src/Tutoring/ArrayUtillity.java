package Tutoring;

public class ArrayUtillity {
	
	static double[] intToDouble( int [] source){
		double[] castInt = new double[5];
		
		for (int i = 0; i < source.length; i++) {
			castInt[i] = (double)source[i];
		}
		return castInt;
	}
	
	static int[] doubleToInt( double [] source){
		int[] castDouble = new int[5];
		
		for (int i = 0; i < source.length; i++) {
			castDouble[i] = (int)source[i];
		}
		return castDouble;
	}
	
	static int[] concat(int[] s1, int[] s2) {
		int[] contact = new int[s1.length + s2.length];
		
		for (int i = 0; i < contact.length; i++) {
			if( i < s1.length)
				contact[i] = s1[i];
			else
				contact[i] = s2[i - s1.length];
		}
		
		return contact;
	}
	
	static int[] remove(int[] s1, int[] s2) {
		int [] removeArray = new int[s1.length + s2.length];
		for (int j = 0; j < removeArray.length; j++) {
			removeArray[j] = 0;
		}
		return removeArray;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 2, 4, 5, 6, 7};
		double[] arr2 = { 1.1 , 2.2, 3.3, 4.4, 5.5};
		
		double [] castDouble = ArrayUtillity.intToDouble(arr1);
		int[] castInt = ArrayUtillity.doubleToInt(arr2);
	
		
		for (int i = 0; i < castInt.length; i++) {
			System.out.println(castInt[i] + " ");
			
		}
		
		for (int i = 0; i < castInt.length; i++) {
				System.out.print(castInt[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		for (int i = 0; i < castDouble.length; i++) {
				System.out.print( castDouble[i] + " ");
		}	
		
		int [] leftArray = {1, 2, 3, 4, 5};
		int [] rightArray = { 5, 4, 3, 2, 1};
		
		int[] contact = ArrayUtillity.concat(leftArray, rightArray);
		int[] removeArray = ArrayUtillity.remove(leftArray, rightArray);

		
		for (int i = 0; i < contact.length; i++) {
				System.out.println(contact[i]);
		}

		for (int i = 0; i < removeArray.length; i++) {
			System.out.println(removeArray[i]);
		}
	

	}
	
}
