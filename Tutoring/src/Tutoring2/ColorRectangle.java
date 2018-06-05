package Tutoring2;

class Shape {
	//private int x, y;
	Shape(int x, int y) {
	System.out.println("Shape() x = " +x +" y = "+y);
	}
		

}

class Rectangle extends Shape{
		//private int width;
		//private int height;
		Rectangle(int x, int y, int width, int height) {
			super(x, y);
			System.out.println("Rectangle x = " +x +" y = "+y +" width = " +width +" height = " +height);

	}

}


public class ColorRectangle extends Rectangle{

	ColorRectangle(int x, int y, int width, int height, String color) {
		//private String color;
		//this.color = color;
		super(x, y, width, height);
		System.out.println("Rectangle x = " +x +" y = "+y +" width = " +width +" height = " +height +" color = " +color);
	
	}
	

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			ColorRectangle a = new ColorRectangle(1, 2, 40, 20, "red");

	}

}
