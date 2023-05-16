package myPackage;

public class Class_exercise_1 {
	
	public static void main(String [] args)
	{
		Member m = new Member(); // 내가 myPackage 아래에 Member라는 새로운 class를 생성했음. m은 Member라는 클래스의 객체인 것. 
		
		Member m2 = new Member();
		
		if(m==m2)
		{
			System.out.println("m 개체와 m2 객체는 같다.");
		}
		else
		{
			System.out.println("m 개체와 m2 객체는 같지 않다.");
		}
		
		// m과 m2는 같은 자료형이지만, 저장된 주솟값이 다르기 때문에, 같지 않다고 나옴. 즉, 서로 독립된 개체이다. 
		
		Class_exercise_1 m3 = new Class_exercise_1(); // 이런식으로 myPackage안에 있는 다른 곳의 클래스를 가져올수도 있지만, 현재 class 타입으로 객체를 생성해도 됨. But, 부품별로 조립하는게 훨씬 안정적이고 편하기 때문에, 다른 클래스를 가져와서 사용하는거 추천 !
		
		
		Class_exercise_1 m4 = new Class_exercise_1();
		
		if(m3==m4)
		{
			System.out.println("m3 개체와 m4 객체는 같다.");
		}
		else
		{
			System.out.println("m3 개체와 m4 객체는 같지 않다.");
		}
		
		
		
		
		
	}

}

// 자바에서 클래스, 객체란 한 마디로 클래스는 설계도, 객체는 이 설계도로 만들어진 피조물. 

// 클래스, 객체의 생성은 다음과 같이 이루어 질 수 있다.

// 클래스명 변수명;

// 변수명 = new 클래스명(); => 예전에 review 했었던 heap 영역에 저장되는 변수.

// 클래스명 변수명 = new 클래스명();

// 즉, 클래스명은 자료형이 될 수도 있음. 이렇게 객체를 생성하는 것을 인스턴스화 한다고 표현. new 연산자로 내가 직접 만든 클래스는 사용자 정의 자료형이라고 하고, 사용자 정의 자료형도 참조 자료형 중 하나이다.(주소값을 가진다.)

// 또, 지금까지 내가 생성했던 class도 모두 그대로 클래스님. 현재 Class_exercise_1도 클래스이다. 

// 출력 결과
/*
m 개체와 m2 객체는 같지 않다.
 */
