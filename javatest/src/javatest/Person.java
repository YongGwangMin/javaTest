package javatest;

import java.util.Scanner;

public class Person {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int 나이 = 0;
		String 번호 = null;
		String 이름 = null;
		
		System.out.println("나이>>");
		나이 = scanner.nextInt();
		
		System.out.println("번호>>");
		번호 = scanner.nextLine();
				
		System.out.println("이름>>");
		이름 = scanner.nextLine();
		
		System.out.println("이름 "+이름+" 나이 "+나이+" 번호 "+번호+"");
	}

}
