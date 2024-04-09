package javatest;

import java.util.Scanner;

public class Aaaa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double m;
		double km;
		double a;
		
		m = 1.0;
		km = 1.609;
		
		System.out.print("마일을 입력하시오");
		m = sc.nextDouble();
		a = km * m;
		
		System.out.println(""+m+"마일은 "+a+"km입니다" );
	}

}
