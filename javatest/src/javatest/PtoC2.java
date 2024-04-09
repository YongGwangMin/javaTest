package javatest;

import java.util.Scanner;

public class PtoC2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double c = 0.0;
		double f = 0.0;
		int n = 0;
		
		System.out.print("번호를 입력하시오");
		n = sc.nextInt();
		if(n==1) {
			System.out.print("화씨 온도를 입력하시오");
			f = sc.nextDouble();
			c = 5.0/9.0*(f-32.0);
			System.out.print("섭씨 온도는 "+c+"입니다");
		} else {
			System.out.print("섭씨 온도를 입력하시오");
			c = sc.nextDouble();
			f = 9.0/5.0*c+32.0;
			System.out.print("화씨 온도는 "+f+"입니다");
			
		}
		

	
		

	}

}
