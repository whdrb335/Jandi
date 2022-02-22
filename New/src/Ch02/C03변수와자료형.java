
//	* 변수
//	- 데이터를 담아두는 상자!
//	- 반드시 사용하기전 미리 선언!
//	- 자료형을 쓰고 변수이름 그리고 세미콜론 ;
//	- 변수의 구조 = (int value = 9;)
//
//	* 자료형
//	- 변수에 저장되는 데이터의 타입
//	
//	* 정수형
//	byte   1바이트    
//	short  2바이트
//	int    3바이트       최소 : -21억    최대 : 21억
//	long   4바이트


// Light.java
//package Ch02;
//
//public class C03변수와자료형 {
//
//	public static void main(String[] args) {
//
//		long distance;
//		long lightspeed;
//		
//		lightspeed = 300000;
//		distance = lightspeed * 365L * 24 * 60 * 60;
//		
//		System.out.println("빛이 1년동안 가는거리  :"+distance+"Km.");
//	
//	}
//}

//* 부동 소수점형
//float  32(비트)
//double 64(비트)
// * AreaTest.java
package Ch02;

public class C03변수와자료형 {

	public static void main(String[] args) {
		double radius,area;
		radius = 5.0;
		area = 3.14 * radius * radius;
		System.out.println("원의 면적은 : "+area);
	
	}
}


