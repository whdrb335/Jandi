package Ch03���ð��ݺ�;

import java.util.Scanner;

public class C02ifelse�� {

	public static void main(String[] args) {
		
//		����) ¦�� Ȧ�� �����ϱ�
//		int x;
//		Scanner input = new Scanner(System.in);
//		System.out.print("������ �Է��Ͻÿ� : ");
//		x = input.nextInt();
//		
//		if (x % 2 ==0) {
//			System.out.println("�Էµ� ������ ¦���Դϴ�");
//		}
//		else{
//			System.out.println("�Էµ� ������ Ȧ���Դϴ�");
//		}
		
		// �μ��� ū�� ����ϱ�
//		int x;
//		int y;
//		int max;
//		Scanner input = new Scanner(System.in);
//		System.out.print("ù��° ���� : ");
//		x = input.nextInt();
//		
//		
//		System.out.print("�ι�° ���� : ");
//		y = input.nextInt();
//		
//		if (x > y) 
//			max = x;
//		
//		else 
//			max = y;
//		
//		System.out.println("ū���� : "+max);
		
		// ** ���� : ������ ���
//		final int targetsales = 1000;
//		int mysales;
//		int bonus;
//		String result;
//		
//		Scanner input = new Scanner(System.in);
//		System.out.print("������ �Է��Ͻÿ�(����:����) : ");
//		mysales = input.nextInt();
//		
//		if (mysales > targetsales) {
//			result = "���� �޼�";
//			bonus = (mysales - targetsales) / 10;
//		}
//			else {
//				result = "���� ����";
//				bonus = 0;
//			}
//		System.out.println(result + "\n" + "���ʽ� : "+bonus);
		
		int grade;
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� : ");
		grade = input.nextInt();

		if (grade >= 90) {
			System.out.print("����A");
		}
		else if (grade >= 80 ) {
			System.out.print("����B");
		}
		else if (grade >= 70 ) {
			System.out.print("����C");
		}
		else if (grade >= 70 ) {
			System.out.print("����D");
		}
		else {
			System.out.print("����F");
		}
			
		}
		

	}


