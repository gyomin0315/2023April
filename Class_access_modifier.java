package myPackage;

public class Class_access_modifier {
	
	public static void main(String args[])
	{
		ClassB cb = new ClassB();
		cb.print();
		
	}
	
	public void print()
	{
		System.out.println("여기는 ClassA");
		
		
	}

}

class ClassB // ClassB는 접근 제한자가 생략되어 있고, default 제한자 갖는다. default제한자는 동일패키지 까지만 가능. (private는 동일클래스밖에 안됬었음 !)
{
	
	
	void print()
	{
		System.out.println("여기는 ClassB");
	}
	
}

//출력 결과
/*
여기는 ClassB

 */

// 이전에 접근 제한자에 대해 정리해 놓은 글 다시 살펴볼 것 !
