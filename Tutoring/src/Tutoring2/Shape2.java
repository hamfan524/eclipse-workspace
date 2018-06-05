package Tutoring2;

public abstract class Shape2 {
	
	abstract void draw();
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Shape2 t = new Triangle();
	Shape2 r = new Rectangle2();
	Shape2 c = new Circle();

	//t.draw();
	//r.draw();
	//c.draw();
	
		Shape2 [] shapeArray = { t, r, c };
		
		for (int i = 0; i < shapeArray.length; i++) {
			shapeArray[i].draw();
		}
	}

}

class Triangle extends Shape2{	
	void draw() {
		System.out.println("삼각형입니다.");
	
	}

}

class Circle extends Shape2{
	void draw() {
		System.out.println("원입니다.");
	}
	
}

class Rectangle2 extends Shape2{
	void draw() {
		System.out.println("사각형입니다.");
	}

}



