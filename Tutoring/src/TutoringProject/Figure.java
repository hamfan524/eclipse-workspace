package TutoringProject;

public class Figure{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area c = new Cir();
		Area r = new Rec();
		Area t = new Tri();
		
		System.out.println("���� ���̴� " + c.putArea());
		System.out.println("�簢���� ���̴� " + r.putArea());
		System.out.println("�ﰢ���� ���̴� " + t.putArea());
	}
}

interface Area{
	public double putArea();
}

class Num{
	double radius = 5;
	double height = 5;
	double width = 5;
	
}

class Cir extends Num implements Area{
	public double putArea(){
		return radius*radius*3.14;		
	}
}

class Rec extends Num implements Area{
	
	public double putArea(){
		return height*width;
	}
}

class Tri extends Num implements Area{
	
	public double putArea(){

		return height*width/2;
	}
}