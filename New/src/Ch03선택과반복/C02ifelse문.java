package Ch03선택과반복;

import java.util.Scanner;

public class C02ifelse문 {

	public static void main(String[] args) {
		
//		예제) 짝수 홀수 구분하기
//		int x;
//		Scanner input = new Scanner(System.in);
//		System.out.print("정수를 입력하시오 : ");
//		x = input.nextInt();
//		
//		if (x % 2 ==0) {
//			System.out.println("입력된 정수는 짝수입니다");
//		}
//		else{
//			System.out.println("입력된 정수는 홀수입니다");
//		}
		
		// 두수중 큰수 출력하기
//		int x;
//		int y;
//		int max;
//		Scanner input = new Scanner(System.in);
//		System.out.print("첫번째 정수 : ");
//		x = input.nextInt();
//		
//		
//		System.out.print("두번째 정수 : ");
//		y = input.nextInt();
//		
//		if (x > y) 
//			max = x;
//		
//		else 
//			max = y;
//		
//		System.out.println("큰수는 : "+max);
		
		// ** 예제 : 성과급 계산
//		final int targetsales = 1000;
//		int mysales;
//		int bonus;
//		String result;
//		
//		Scanner input = new Scanner(System.in);
//		System.out.print("실적을 입력하시오(단위:만원) : ");
//		mysales = input.nextInt();
//		
//		if (mysales > targetsales) {
//			result = "실적 달성";
//			bonus = (mysales - targetsales) / 10;
//		}
//			else {
//				result = "실적 실패";
//				bonus = 0;
//			}
//		System.out.println(result + "\n" + "보너스 : "+bonus);
		
		int grade;
		Scanner input = new Scanner(System.in);
		System.out.print("성적을 입력하시오 : ");
		grade = input.nextInt();

		if (grade >= 90) {
			System.out.print("학점A");
		}
		else if (grade >= 80 ) {
			System.out.print("학점B");
		}
		else if (grade >= 70 ) {
			System.out.print("학점C");
		}
		else if (grade >= 70 ) {
			System.out.print("학점D");
		}
		else {
			System.out.print("학점F");
		}
			
		}
		

	}


