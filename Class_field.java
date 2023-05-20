package myPackage;

public class Class_field {
	
	public static void main(String args[])
	{
		System.out.println("Avante 제조사 :" + Avante.company);
		
		Avante a1 = new Avante();
		Avante a2 = new Avante();
		
		a1.color = "white";
		a2.color = "black";
		
		System.out.println("a1 색상 : " + a1.color);
		System.out.println("a2 색상 : " + a2.color);
		
		System.out.println("a1 제조사 : " + a1.company);
		System.out.println("a2 제조사 : " + a2.company);
		
		a1.company = "Kia"; // 클래스 변수의 값 변경
		
		System.out.println("Avante 제조사 : " + Avante.company );
		System.out.println("Avante 제조사 : " + a1.company );
		System.out.println("Avante 제조사 : " + a2.company );
		
		
		
		
		
		
		
	}
	
	
	

}

class Avante{
	
	
	String color; // 인스턴스 변수
	static String company = "Hyundai"; // 얘는 C에서 처럼 전역변수처럼 사용 가능. 클래스 변수라고 하고, static으로 생성된 객체는 어느 클래스 안에서든 바로 사용 가능. 
	
	
}

// 필드란 , 객체의 고유한 속성이나, 상태값을 저장하는 곳. 

// 클래스 변수는 클래스가 메모리에 로드 될때 생성되고, 인스턴스 변수는 객체가 생성될때 생성. 

//출력 결과
/*
Avante 제조사 :Hyundai
a1 색상 : white
a2 색상 : black
a1 제조사 : Hyundai
a2 제조사 : Hyundai
Avante 제조사 : Kia
Avante 제조사 : Kia
Avante 제조사 : Kia

 */

// 인스턴스 변수는 객체마다 독립적인 값을 갖고, 클래스 변수는 모든 객체들이 공유하는 변수이다. 
