package itacademy_lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PatientContainer patients = new PatientContainer();
		for(int i=0; i<3; i++) {
			Patient patient= new Patient();
			patient.inputPatientInfo();
			patients.patientList.add(patient);
		}
		System.out.println("Введите имя пациента для поиска информации");
		patients.showPatientsInfoByName(scanner.nextLine());
	}
}
