package javatest;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int 수학 = 0;
		int 국어 = 0;
		int 영어 = 0;
		int 합계 = 0;
		System.out.print("수학>>");
		수학 = scanner.nextInt();
		
		System.out.print("국어>>");
		국어 = scanner.nextInt();

		System.out.print("영어>>");
		영어 = scanner.nextInt();
		합계 = 국어 + 영어 + 수학;
		
		System.out.println("합계 = "+합계+" = "+수학+" + "+국어+" + "+영어+"");
	}

}
