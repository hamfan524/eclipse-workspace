package TutoringProject;

public abstract class Shape {
	double height;
	double width;
	double radius;
	public abstract double getArea(double height, double width);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape c = new Circ();
		Shape r = new Rect();
		Shape t = new Trian();
		
		c.height = 5; c.width = 5;
		r.height = 5; r.width = 5;
		t.height = 5; t.width = 5;
		
		System.out.println("¿øÀÇ ³ÐÀÌ´Â " +c.getArea(c.height, c.width));
		System.out.println("»ç°¢ÇüÀÇ ³ÐÀÌ´Â " +r.getArea(r.height, r.width));
		System.out.println("»ï°¢ÇüÀÇ ³ÐÀÌ´Â " +t.getArea(t.height, t.width));
	}

}

class Circ extends Shape{
	public double getArea(double height, double width){
		super.radius = height;

		return radius*radius*3.14;		
	}	
}

class Rect extends Shape{
	public double getArea(double height, double width){
		super.height = height;
		super.width = width;
		
		return height*width;
	}
}

class Trian extends Shape{
	public double getArea(double height, double width){
		super.height = height;
		super.width = width;
		
		return height*width/2;
	}
}