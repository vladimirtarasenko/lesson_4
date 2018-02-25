package itacademy_lesson4;

import java.util.Scanner;
 class Patient {

	public String firstName;
	private String lastName;
	private int age = 0;
	private boolean isMan;
	private Scanner scanner =  new Scanner(System.in);
	
		public void inputPatientInfo() {
			System.out.println("Введите имя пациента ");
			firstName = scanner.nextLine();
			System.out.println("Введите фамилию пациента");
			lastName = scanner.nextLine();
			System.out.println("Введите возраст пациента" );
			age = scanner.nextInt();
			System.out.println("Введите пол пациента: мужчина - 1, женщина - 0");
			isMan = scanner.nextInt() == 1 ? true : false;	
			scanner.reset();
			}
		
		public void outputPatientInfo( ) {
			System.out.println("Фамилия - "+lastName+"  Имя - "+firstName+" Возраст -" + age +
				" Пол -"	+(isMan ? "Мужчина" : "Женщина"));
		}
}
