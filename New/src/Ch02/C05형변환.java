//
// * �ڵ����� ����ȯ
// - �ǿ����� �� �ϳ��� double �� �̸� �ٸ� �ǿ����ڵ� double ������ ��ȯ
// - �ǿ����� �� �ϳ��� float �� �̸� �ٸ� �ǿ����ڵ� float ������ ��ȯ
// - �ǿ����� �� �ϳ��� long �� �̸� �ٸ� �ǿ����ڵ� long ������ ��ȯ
// - �ƴϸ� ���� int ������ ��ȯ

package Ch02;

public class C05����ȯ {

	public static void main(String[] args) {
		int i;
		double f;
		
		f = 5 / 4;
		System.out.println(f);
		
		f = (double) 5 / 4;
		System.out.println(f);
		
		i = (int) 1.3 + (int) 1.8;
		System.out.print(i);

	}

}
