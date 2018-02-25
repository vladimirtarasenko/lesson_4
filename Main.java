package itacademy_lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	public static class ArraySort {
	private	int[] arr= new int[10];
	public void arrayinput() {
		for(int i=0; i<10; i++) {
			System.out.println("¬ведите "+i+"й элемент массива");
			arr[i] = scanner.nextInt();
		}
	}		
		public void arraysort() {
			Arrays.sort(arr);
		}		
		public void arrayoutput () {
			for(int i=0; i<10; i++) {
				System.out.println(arr[i]);
			}
		}
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraySort newArray = new ArraySort();
		newArray.arrayinput();
		newArray.arraysort();
		newArray.arrayoutput();		
	}
}
