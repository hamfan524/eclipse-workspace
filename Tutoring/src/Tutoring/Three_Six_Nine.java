package Tutoring;

class Three_Six_Nine {
	
	public void startGame() {
		String s;
		boolean ck = true;
		
		for (int i = 0; i < 1000; i++) {
			
			s = i + " ";
			
			for(int j = s.length() - 1; j >= 0; j--) {
			if(s.charAt(j) == '3' || s.charAt(j) == '6' || s.charAt(j) == '9' ) {
				
				if(ck) {
					System.out.print(s + "¹Ú¼ö");
				}
				System.out.print("Â¦");
				ck = false;
				}
			}
			ck = true;
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Three_Six_Nine p1 = new Three_Six_Nine();
		p1.startGame();

	}

}
