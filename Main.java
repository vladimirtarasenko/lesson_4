package itacademy_lesson4;


import java.util.Scanner;

    class NewsPages {
	static Scanner scanner = new Scanner(System.in);
	public int pageN;
	public int newsNumber;
	// ����������� ���������� �������;
	public int pageNumber(int newsNumber) {
		pageN=newsNumber/10;
		if(newsNumber%10!=0) {
			pageN=pageN+1;}
					return pageN;
		}
	// ���� ���������� ��������;
	public int getNewsNumber() {
		System.out.println("������� ���������� ��������");
		newsNumber=scanner.nextInt();
		return newsNumber;
	}
}

public class Main {
	public static void main(String[] args) {	
		NewsPages pages= new NewsPages();		
		int f=pages.pageNumber(pages.getNewsNumber());				
			System.out.println("��������� ���������� ������� - "+f);
		}		
	}

