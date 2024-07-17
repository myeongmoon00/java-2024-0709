package chapter3;

public class Package1 {

	public static void main(String[] args) {
		
		//Wrapper 클래스 : 기본형 데이터 타입을 참조형 데이터 타입으로 다룰 수 있도록 해주는 클래스
		//일반적으로 기본형 데이터타입의 풀네임을 사용하고 첫글자를 대문자로 지정한다.
		//NULL 값을 받기위한 용도로 사용할수도 있다.
		Integer wrapperInt = 10;
		Double wrapperDouble = 10.0;
		Boolean wrapperBoolean = false;
		String wrapperString = "문자열";
		
		//자주 사용되는 기능
		//parse 메서드 : 문자열을 특정 타입으로 변환
		int number = Integer.parseInt("12345");
		//toString 메서드 : 특정한 타입의값을 문자열로 변환
		String stringNumber = Integer.toString(2024);
		stringNumber = wrapperInt.toString();
		System.out.println(stringNumber);
		
		//Math 클래스 : 수학 연산과 관련된 다양한 메서드를 제공해주는 클래스
		//모든 메서드가 static인 정적 메서드
		//올림
		System.out.println(Math.ceil(3.14));
		//내림
		System.out.println(Math.floor(3.14));
		//반올림
		System.out.println(Math.round(3.14));
		
		//특정 자리에서 올림, 내림 반올림
		//소수점 자리
		//3.1415 *1 100 => 314.15
		//round(3.1415 * 100) =>3.14
		//round(3.1415 * 100) / 100.0
		System.out.println(Math.round(3.1415 * 100) / 100.0);
		
		//정수자리
		//98765 / 100 = 987 * 100
		//Math.round(98765 / 100.0)  => 988.0
		//Math.round(98765/100.0) *100
		
		System.out.println(Math.round(98765/100.0)*100);
		//pow 거듭제곱1
		System.out.println(Math.pow(2,10));
		
		
	}

}
