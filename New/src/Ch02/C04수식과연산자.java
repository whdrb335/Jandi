// * ���� ����
// - ���ʿ� �ִ� ������ �����ʿ� �ִ� ������ ���� ��� (ex x = 100;)
// 
// * ������ ������
// - % ������
// * ���� �˻�
//package Ch02;
//
//public class C04���İ������� {
//
//	public static void main(String[] args) {
//		int year = 2012;
//		boolean isLeapYear;
//		
//		isLeapYear = (year % 4 == 0);
//		System.out.println(isLeapYear);
//		
//
//	}
//
//}

// * ����������
// - ++x : x���� ���� �������� �ٸ����� �̿� , ������ x��
// - x++ : x���� ���� ����� �� ����, �������� �ʴ� x��
// - --x : x���� ���� �������� �ٸ����� �̿�, ���ҵ� x��
// - x-- : x���� ���� ������� ���� , ���ҵ��� �ʴ� x��

//package Ch02;
//
//public class C04���İ������� {
//
//	public static void main(String[] args) {
//		int x = 1;
//		int y = 1;
//		
//		int nextx = ++x;
//		int nexty = y++;
//		
//		System.out.println(nextx);
//		System.out.println(nexty);
//		
//
//	}
//
//}

// * ���� ������
// - x == y : x�� y�� ������?
// - x != y : x�� y�� �ٸ���?

//package Ch02;
//
//public class C04���İ������� {
//
//	public static void main(String[] args) {
//		int x = 3;
//		int y = 4;
//		
//		System.out.println((x == y)+ " ");
//		System.out.println((x != y)+ " ");
//		System.out.println((x > y)+ " ");
//		System.out.println((x < y)+ " ");
//		System.out.println((x <= y)+ " ");
//		
//
//	}
//
//}

// * ��������
// - x && y : AND ���� , x�� y�� ��� ���̸� �� �ƴϸ� ����
// - x || y : OR ����  , x�� y�߿� �ϳ��� ���̸� ��, ��� �����̸� ����
// - !x     : NOT ���� , x�� ���̸� ���� �����̸� ��
 
package Ch02;

public class C04���İ������� {

	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		System.out.println((x == 3) && (y == 7));
		System.out.println((x == 3 || y == 7));

	}

}
 

 