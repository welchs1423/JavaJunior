package ch07.sec04.exam01;

public class Computer extends Calculator{
	//메소드 오버라이딩
	@Override
	public double areaCircle(double r) {	// 더 강한 접근제한자로 정의할수 없다 public -> private 불가능 반대는 가능
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
