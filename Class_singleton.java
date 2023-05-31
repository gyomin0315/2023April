package myPackage;

public class Class_singleton {
	
	// static 변수
	
	private static Class_singleton instance = new Class_singleton();
	
	// 생성자에 private 접근 제한자
	
	private Class_singleton()
	{
		System.out.println("객체 생성");
	}
	
	//static 메소드 
	
	public static Class_singleton getInstance()
	{
		System.out.println("객체 리턴");
		return instance ;
	}
	
	
	
	

}

// 자바에서는 객체의 무분별한 생성을 막기 위해 싱글톤을 사용한다. 객체를 생성할 때 new 연산자를 이용해 생성하게 되면, 실행된 횟수만큼 새로운 객체가 생성되기 때문에, 메모리 부족 현상 생김.

// 이럴 때, 특정 클래스는 하나의 객체만 생성되도록 할수 있고, 싱글톤이라고 함. 

// 접근제한자를 사용해서, private(클래스 안에서만 사용 가능) 쓰고, static 변수로 객체를 생성해 둔다. 그리고 static 메소드를 통해 이 객체를 리턴하도록 정의.


