package javatest;

import java.util.Scanner;

public class Class {

	public static void main(String[] args) {
		double kg;
		double s;
		double e;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("물체의 무게를 입력하시오");
		kg = sc.nextDouble();
		System.out.print("물체의 속도를 입력하시오");
		s = sc.nextDouble();
		e = 0.5*kg*(s*s);
		
		System.out.println("물체는 "+e+"(줄의)에너지를 가지고 있다.");
	}

}
