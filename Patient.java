package itacademy_lesson4;

import java.util.Scanner;
 class Patient {

	public String firstName;
	private String lastName;
	private int age = 0;
	private boolean isMan;
	private Scanner scanner =  new Scanner(System.in);
	
		public void inputPatientInfo() {
			System.out.println("������� ��� �������� ");
			firstName = scanner.nextLine();
			System.out.println("������� ������� ��������");
			lastName = scanner.nextLine();
			System.out.println("������� ������� ��������" );
			age = scanner.nextInt();
			System.out.println("������� ��� ��������: ������� - 1, ������� - 0");
			isMan = scanner.nextInt() == 1 ? true : false;	
			scanner.reset();
			}
		
		public void outputPatientInfo( ) {
			System.out.println("������� - "+lastName+"  ��� - "+firstName+" ������� -" + age +
				" ��� -"	+(isMan ? "�������" : "�������"));
		}
}
