package itacademy_lesson4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PatientContainer {

	public ArrayList<Patient> patientList;
	
	static Scanner scanner = new Scanner(System.in);
	
	PatientContainer(){
		patientList = new ArrayList<Patient>();
	}
	
	public void showPatientsInfoByName(String name) {
		boolean isUserExsists = false;
		for(Patient patient : patientList) {
			if(patient.firstName.equals(name)) {
				patient.outputPatientInfo();
				isUserExsists = true;
			}
		}
		if(!isUserExsists) {
			System.out.println("Пациент не найден");
		}
	}
}
