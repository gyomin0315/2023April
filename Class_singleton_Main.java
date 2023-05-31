package myPackage;

public class Class_singleton_Main {
	
	
	public static void main(String args[])
	
	{
		// Class_singleton s = new Class_singleton(); 이런식으로 객체 생성할 수 없음. Class_singleton은 private으로 선언했으니까. 객체 생성하려면 public으로 선언한 getInstance로 해야함.
		
		
		Class_singleton s1 = Class_singleton.getInstance();
		Class_singleton s2 = Class_singleton.getInstance();
		Class_singleton s3 = Class_singleton.getInstance();
		
		
		
		
	}

}

//출력 결과
/*

 */
