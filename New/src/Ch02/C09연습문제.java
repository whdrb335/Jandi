
// * 원의 면적 계산하기
//package Ch02;
//
//import java.util.Scanner;
//
//public class C09연습문제 {
//
//	public static void main(String[] args) {
//		double radius;
//		double area;
//		
//		Scanner input = new Scanner(System.in);
//		System.out.print("반지름을 입력하시오 : ");
//		radius = input.nextDouble();
//		area = 3.14 * radius * radius;
//		
//		System.out.print(area);
//		
//
//	}
//
//}

// * 직사각형 둘레와 면적 계산하기
package Ch02;

import java.util.Scanner;

public class C09연습문제 {

	public static void main(String[] args) {
		double w,h,area,perimeter;
		
		Scanner input = new Scanner(System.in);
		System.out.print("사각형의 가로를 입력하시오 : ");
		w = input.nextDouble();
		System.out.print("사각형의 세로를 입력하시오 : ");
		h = input.nextDouble();
		area = w*h;
		perimeter = 2*(w + h);
		System.out.println("사각형의 넓이는 " + area);
		System.out.println("사각형의 둘레는" + perimeter);

	}

}
