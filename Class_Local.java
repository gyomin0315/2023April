package myPackage;

public class Class_Local {
	
	public static void main(String args[])
	{
		Local local = new Local();
		
		System.out.println(local.name);
		
		local.process();
		
		System.out.println(local.name);
		
		local.printAge1();
		local.printAge2();
		
		for(int i=0;i<10;i++)
		{
			int temp =0; //temp는 지역변수.
			temp +=i;
			
		}
		// System.out.println(temp); temp는 지역변수니까 for문 중괄호 안에서만 사용 가능하다. 그래서 오류남. 
		
		// System.out.println(Local.age); 얘도 당연히 오류.
		
	}

}

class Local{
	
	String name;
	
	void process() {
		
		name = "구교민";
		
		
	}
	
	void printAge1() {
		int age = 25; // 지역변수
		System.out.println(age);
		
	}
	
	void printAge2() {
		
		int age = 30;
		System.out.println(age);
		
	}
	
	
}

//출력 결과
/*
null
구교민
25
30
 */
