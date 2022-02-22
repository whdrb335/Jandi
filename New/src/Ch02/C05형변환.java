//
// * 자동적인 형변환
// - 피연산자 중 하나가 double 형 이면 다른 피연산자도 double 형으로 변환
// - 피연산자 중 하나가 float 형 이면 다른 피연산자도 float 형으로 변환
// - 피연산자 중 하나가 long 형 이면 다른 피연산자도 long 형으로 변환
// - 아니면 전부 int 형으로 변환

package Ch02;

public class C05형변환 {

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
