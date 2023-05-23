package myPackage;

public class Class_call_exercise {
	
	public static void main(String args[])
	{
		// 직접 실행
		Method.printName();
		
		// 객체를 생성해서 실행
		Method m = new Method();
		
		m.printEmail();
		
		Methodstack m2 = new Methodstack();
		m2.one();
		
		System.out.println(divide(pow(add(3,3)))); // divide가 가장 먼저 실행, 가장 나중에 종료. 
	}
	
	static int add(int x, int y)
	{
		return x+y;
	}
	
	static int pow(int x)
	{
		return x*x;
	}

	
	static int divide(int x)
	{
		return x/2;
	}


}

class Method{
	
	static void printName()
	{
		System.out.println("printName() 실행");
		System.out.println("구교민");
	}
	
	void printEmail()
	{
		System.out.println("printEmail() 실행");
		System.out.println("bluesky030@naver.com");
		
		printId();
	}
	void printId()
	{
		System.out.println("printId() 실행");
		System.out.println("980315");
	}
	
}

class Methodstack{
	
	void one()
	{
		two();
		System.out.println("one");
	}
	void two()
	{
		three();
		System.out.println("two");
	}
	void three()
	{
		System.out.println("three");
	}
	
	
	
}



//출력 결과
/*
printName() 실행
구교민
printEmail() 실행
bluesky030@naver.com
printId() 실행
980315
three
two
one
18

 */

// 메소드는 실행될 때, 스택 자료구조로 만들어진 메모리에서 실행된다. 때문에, 먼저 실행된 메소드가 가장 나중에 종료됨. 
