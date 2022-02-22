// * 대입 연산
// - 왼쪽에 있는 변수에 오른쪽에 있는 수식의 값을 계산 (ex x = 100;)
// 
// * 나눗셈 연산자
// - % 나머지
// * 윤년 검사
//package Ch02;
//
//public class C04수식과연산자 {
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

// * 증감연산자
// - ++x : x값을 먼저 증가한후 다른연산 이용 , 증가된 x값
// - x++ : x값을 먼저 사용한 후 증가, 증가되지 않는 x값
// - --x : x값을 먼저 감소한후 다른연산 이용, 감소된 x값
// - x-- : x값을 먼저 사용한후 감소 , 감소되지 않는 x값

//package Ch02;
//
//public class C04수식과연산자 {
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

// * 관계 연산자
// - x == y : x와 y가 같은가?
// - x != y : x와 y가 다른가?

//package Ch02;
//
//public class C04수식과연산자 {
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

// * 논리연산자
// - x && y : AND 연산 , x와 y가 모두 참이면 참 아니면 거짓
// - x || y : OR 연산  , x나 y중에 하나만 참이면 참, 모두 거짓이면 거짓
// - !x     : NOT 연산 , x가 참이면 거짓 거짓이면 참
 
package Ch02;

public class C04수식과연산자 {

	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		System.out.println((x == 3) && (y == 7));
		System.out.println((x == 3 || y == 7));

	}

}
 

 