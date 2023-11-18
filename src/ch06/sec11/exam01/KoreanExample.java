package ch06.sec11.exam01;

public class KoreanExample {
	public static void main(String[] args) {
		// 객체 생성시 주민등록번호와 이름 전달
		Korean K1 = new Korean("123456-1234567", "김자바");

		// 필드값 읽기
		System.out.println(K1.nation);
		System.out.println(K1.ssn);
		System.out.println(K1.name);

		// Final 필드는 값을 변경할 수 없음
		// K1.nation = "USA";
		// K1.ssn = "123-12-1234";

		// 비 Final 필드는 변경 가능
		K1.name = "김자바";
	}
}
