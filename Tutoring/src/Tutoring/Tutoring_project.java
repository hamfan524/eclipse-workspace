package Tutoring;

class Tutoring_project {
	
	static double usr1 = 10;
	static double usr2 = 10;
	static int count = 0;
	
	public void startGame() {
		double a;
		double b;
		
		while(true) {
			a = (int)( Math.random() * 7 + 1);
			b = (int)( Math.random() * 7 + 1);
			
			if ( a > b) {
				usr1 -= a/2;
				usr2 += a/2;
				System.out.println("Usr1�� ���� "+a/2+"��ŭ Usr2�� ������.");
			}
			else if ( b > a ) {
				usr2 -= b/2;
				usr1 += b/2;
				System.out.println("Usr2�� ���� "+b/2+"��ŭ Usr1�� ������.");
			}
			
			++count;
			
			if ((usr1 <= 0) || (usr2 <= 0)) {
				break;
			}
		}
		System.out.println("�� �� : " +count);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tutoring_project game = new Tutoring_project();
		
		game.startGame();
	
		
	}

}
