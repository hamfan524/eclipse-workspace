package Tutoring;

public class Person {

		private int perID, milID, Year, Month, Date;
		
		public Person(int pID, int mID, int year, int month, int date) {
			perID = pID;
			milID = mID;
			Year = year;
			Month = month;
			Date = date;
			
		}
		public Person(int pID, int year, int month, int date) {
			perID = pID;
			milID = 0;
			Year = year;
			Month = month;
			Date = date;
			
		}
		
		void showInfo() {
			System.out.println("�ι� : " +perID);
			System.out.print("������� : "+Year);
			System.out.printf("/%02d/%02d\n", Month, Date);			
			
			if(milID != 0) {
				System.out.println("���� : " +milID);
				System.out.println();
			}
			
			else
				System.out.println("���� ���� ����");
		}
		
		public static void main(String[] args) {
			Person man = new Person(950205, 71017177, 1995,02,05);
			Person woman = new Person(981015,1998,10,15);
			man.showInfo();
			woman.showInfo();
			
		}

	}


