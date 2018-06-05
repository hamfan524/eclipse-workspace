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
				System.out.println("Usr1의 땅을 "+a/2+"만큼 Usr2가 가져감.");
			}
			else if ( b > a ) {
				usr2 -= b/2;
				usr1 += b/2;
				System.out.println("Usr2의 땅을 "+b/2+"만큼 Usr1가 가져감.");
			}
			
			++count;
			
			if ((usr1 <= 0) || (usr2 <= 0)) {
				break;
			}
		}
		System.out.println("턴 수 : " +count);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tutoring_project game = new Tutoring_project();
		
		game.startGame();
	
		
	}

}
