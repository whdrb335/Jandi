
// * ���� ���� ����ϱ�
//package Ch02;
//
//import java.util.Scanner;
//
//public class C09�������� {
//
//	public static void main(String[] args) {
//		double radius;
//		double area;
//		
//		Scanner input = new Scanner(System.in);
//		System.out.print("�������� �Է��Ͻÿ� : ");
//		radius = input.nextDouble();
//		area = 3.14 * radius * radius;
//		
//		System.out.print(area);
//		
//
//	}
//
//}

// * ���簢�� �ѷ��� ���� ����ϱ�
package Ch02;

import java.util.Scanner;

public class C09�������� {

	public static void main(String[] args) {
		double w,h,area,perimeter;
		
		Scanner input = new Scanner(System.in);
		System.out.print("�簢���� ���θ� �Է��Ͻÿ� : ");
		w = input.nextDouble();
		System.out.print("�簢���� ���θ� �Է��Ͻÿ� : ");
		h = input.nextDouble();
		area = w*h;
		perimeter = 2*(w + h);
		System.out.println("�簢���� ���̴� " + area);
		System.out.println("�簢���� �ѷ���" + perimeter);

	}

}
