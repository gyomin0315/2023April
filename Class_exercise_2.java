package myPackage;

public class Class_exercise_2 {
	
	
		// 자동차라는 클래스가 정의되었고, 자동차의 속성과 기능을 설계해보자. 
		
		// 필드
		
		String color;
		String company;
		String type;
		
		// 메서드 
	
	public void go() {
		
		System.out.println("전진하다.");
	}
	
	public void back()
	{
		System.out.println("후진하다.");
	}
		
	}



// 클래스를 구성하는 요소.

// 1) 필드 : 객체의 특징이나, 특성 값을 저장하는 곳. 클래스 내부 전체에서 사용되는 변수라고 생각하면 됨.

// 2) 생성자 : 객체를 생성할 때 사용되는 부분. 클래스명과 이름이 같고, 리턴값이 없다.

// 3) 메서드 : 객체의 기능. 함수라고 생각하면 될것 같음.

// 4) C에서 구조체란, 다양한 데이터형을 여러개 저장할수있는 구조였다. 자바에서 클래스란, 데이터와 기능을 함께 저장할 수 있는 자료구조이다. 

// String이 자료형이 아니라 클래스로 정의되어 있는 이유는, 문자열을 다양하게 처리할 수 있는 기능도 포함되어 있기 때문. 

// 이 Class에는 main함수가 없음. 즉, 이 class는 다른 클래스에 있는 main 함수 안에서 쓸것임. 이게 가능한 이유는 main 함수 선언할때 public을 사용해서 가능한듯. 
