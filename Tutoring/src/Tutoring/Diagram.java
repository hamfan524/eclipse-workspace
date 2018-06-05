package Tutoring;


class Triangle extends Diagram {
	
	public Triangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public void setTriArea() {
		super.setArea();
	}
	public double getArea() {
		return this.area;
	}

}
	
class Rectangle extends Diagram{	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public void setArea() {
		this.area = this.width * this.height;
	}
	public double getArea() {
		return this.area;
	}

}

public abstract class Diagram {
	double area;
	int width;
	int height;
	
	public void setArea() {
		this.area = this.width * this.height *0.5;
	}
	
	abstract double getArea();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diagram tri = new Triangle(5, 3);
		Diagram rec = new Rectangle(10, 7);
		
		tri.setArea();
		rec.setArea();
		
		System.out.println("»ï°¢Çü ³ÐÀÌ : " + tri.getArea());
		System.out.println("»ç°¢Çü ³ÐÀÌ : " + rec.getArea());

	}

}
