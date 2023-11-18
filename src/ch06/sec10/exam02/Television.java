package ch06.sec10.exam02;

public class Television {
	// 필드 선언
	static String company = "MyCompany";
	static String model = "LCD";
	static String info;

	// 정적 블록 (복잡한 초기화를 하기 위해 사용된다.)
	static {
		System.out.println("1");
		info = "정보 : " + company;
		info += "-" + model;
	}

	static {
		System.out.println("2");
	}
}
