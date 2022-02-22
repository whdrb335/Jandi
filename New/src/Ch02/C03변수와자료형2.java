// * 부동소수점형 리터널
// - double형이 기본 float 쓰면 에러남 , but F를 부팅면 가능
// ex) float temperature - 12.3;   (X)
// ex) float temperature - 12.3F;  (O)
// ex) float temperature - 12_3.0; (O) 밑줄가능
// 
// * 문자형
// - 하나의 문자를 저장
// 
// * 문자형 리터널
// - 단일 따옴표를 사용하여 표현 ' '
// \\ 역슬래시
// \b 백스페이스
// \t 수평탭
// \n 새 라인
 
// * 논리형 
// - 참과 거짓을 나타내는데 사용 true , false
 
//package Ch02;
//
//public class C03변수와자료형2 {
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

// * 변수 초기화
// - 변수를 정의한 후에 반드시 초기화 하고 사용!
// int index;
// index = index+1;
// System.out.println("index : "+ index);   오류!

// * 변수 이름 짓기
//  - 한글 가능
//  - 첫글자는 유니코드 문자 , _, $ 로 시작은 가능
//  - 두번째 문자부터는 문자 , 숫자 , _ , $ 등 가능
//  - 대소문자 구별
//  - 식별자의 이름으로 키워드는 사용 X
//  ex) int 1stprizemoney;   (x) - 첫글자가 숫자
//  ex) int super;           (x) - 키워드
//  ex) int #ofComputer;     (x) - 허용되지 않는 기호
//  
//  * 상수
//  - 값이 변하지 않는 수
//  - 변수 선언때 final 붙이면 대입되고 나면 더이상 변경 X
//package Ch02;
//
//public class C03변수와자료형2 {
//
//	public static void main(String[] args) {
//		final double KM_PER_MILE = 1.609344;
//		double km;
//		double mile = 60.0;
//		km = KM_PER_MILE * mile;
//		
//		System.out.println("60마일은 "+km+"킬로미터 입니다");
//
//	}
//
//}

// * 지구에서 가장 가까운 별까지의 거리 계산하기
package Ch02;

public class C03변수와자료형2 {

	public static void main(String[] args) {
		double distance = 40e12;
		double lightspeed = 30e4;
		
		double secs;
		secs = distance / lightspeed;
		
		double light_year = secs/(60.0*60.0*24.0*365.0);
		System.out.println("걸리는 시간은"+light_year+"광년입니다");

	}

}
  
