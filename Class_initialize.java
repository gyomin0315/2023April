package myPackage;

public class Class_initialize {
	
	// static 변수
	static int sVar;
	
	// static 메소드 
	static void sMethod()
	{
		
	}
	
	// 인스턴스 변수
	int var;
	
	// 인스턴스 메소드
	void method()
	{
		
	}
	
	static 
	{
		sVar =0;
		sMethod();
		
		// static 초기화 블록 안에서 인스턴스 변수, 메소드 사용 불가 . 당연히...
		/*
		var =0;
		method();
		*/
	}
	
	static void sMethod2()
	{
		
		// this도 사용 불가. 
		/*
		this.sVar =0;
		this.sMethod();
		*/
	}
	
	
	
	
	Class_initialize()
	{
		System.out.println("생성자 호출");
	}
	
	// static 초기화 블록
	static
	{
		System.out.println("클래스 초기화 블록 실행");
	}
	
	// 인스턴스 초기화 블록
	{
		System.out.println("인스턴스 초기화 블럭 실행");
	}
	
	public static void main(String args[])
	{
		
		System.out.println("main 메서드 시작");
		System.out.println("main init 객체 생성");
		Class_initialize init = new Class_initialize();
		System.out.println("main init2 객체 생성");
		Class_initialize init2 = new Class_initialize();
		
		
	}

}

//출력 결과
/*
클래스 초기화 블록 실행      ----> 클래스가 메모리에 로드 될때 가장 먼저 static 초기화 블록 실행 얘는 한번만 발생 
main 메서드 시작         ----> main 시작
main init 객체 생성     ----> 객체 생성
인스턴스 초기화 블럭 실행    ----> 인스턴스 초기화 블록은 객체가 생성될때 실행됨. 
생성자 호출              ----> 생성자 호출 실행
main init2 객체 생성    ----> 객체 생성
인스턴스 초기화 블럭 실행     ----> 객체 생성했으니까 다시 인스턴스 블럭 실행 
생성자 호출               ----> 생성자 호출 실행 

 */



// 초기화 블록은 static 초기화 블록과 인스턴스 초기화 블록이 있음. static 초기화 블록은 클래스가 메모리에 로드될 때 한번만 실행됨. 인스턴스 초기화 블록은 객체가 생성될 때마다 실행됨. 

// 객체가 생성됬을때, 인스턴스 초기화 블럭은 생성자보다 먼저 실행됨. 

// static 블록은 객체 생성 시점이 아니라, 클래스를 메로리에 로드 할때 실행되기 때문에, 객체를 기리키는 this 사용 불가.
