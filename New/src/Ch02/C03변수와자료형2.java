// * �ε��Ҽ����� ���ͳ�
// - double���� �⺻ float ���� ������ , but F�� ���ø� ����
// ex) float temperature - 12.3;   (X)
// ex) float temperature - 12.3F;  (O)
// ex) float temperature - 12_3.0; (O) ���ٰ���
// 
// * ������
// - �ϳ��� ���ڸ� ����
// 
// * ������ ���ͳ�
// - ���� ����ǥ�� ����Ͽ� ǥ�� ' '
// \\ ��������
// \b �齺���̽�
// \t ������
// \n �� ����
 
// * ���� 
// - ���� ������ ��Ÿ���µ� ��� true , false
 
//package Ch02;
//
//public class C03�������ڷ���2 {
//
//	public static void main(String[] args) {
//		boolean b;
//		
//		b = true;
//		System.out.println("b : " + b);
//		b = (1 > 2);
//		System.out.println("b : " + b);
//
//	}
//
//}

// * ���� �ʱ�ȭ
// - ������ ������ �Ŀ� �ݵ�� �ʱ�ȭ �ϰ� ���!
// int index;
// index = index+1;
// System.out.println("index : "+ index);   ����!

// * ���� �̸� ����
//  - �ѱ� ����
//  - ù���ڴ� �����ڵ� ���� , _, $ �� ������ ����
//  - �ι�° ���ں��ʹ� ���� , ���� , _ , $ �� ����
//  - ��ҹ��� ����
//  - �ĺ����� �̸����� Ű����� ��� X
//  ex) int 1stprizemoney;   (x) - ù���ڰ� ����
//  ex) int super;           (x) - Ű����
//  ex) int #ofComputer;     (x) - ������ �ʴ� ��ȣ
//  
//  * ���
//  - ���� ������ �ʴ� ��
//  - ���� ���� final ���̸� ���Եǰ� ���� ���̻� ���� X
//package Ch02;
//
//public class C03�������ڷ���2 {
//
//	public static void main(String[] args) {
//		final double KM_PER_MILE = 1.609344;
//		double km;
//		double mile = 60.0;
//		km = KM_PER_MILE * mile;
//		
//		System.out.println("60������ "+km+"ų�ι��� �Դϴ�");
//
//	}
//
//}

// * �������� ���� ����� �������� �Ÿ� ����ϱ�
package Ch02;

public class C03�������ڷ���2 {

	public static void main(String[] args) {
		double distance = 40e12;
		double lightspeed = 30e4;
		
		double secs;
		secs = distance / lightspeed;
		
		double light_year = secs/(60.0*60.0*24.0*365.0);
		System.out.println("�ɸ��� �ð���"+light_year+"�����Դϴ�");

	}

}
  
