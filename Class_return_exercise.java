package myPackage;

public class Class_return_exercise {
	
	public static void main(String args[])
	{
		Return obj = new Return();
		
		String name = obj.getName();
		
		int age = obj.getAge();
		
		System.out.println("이름은 : " + name);
		System.out.println("나이는 : " + age);
		System.out.println("이름은 : " + obj.getName());
		System.out.println("나이는 : " + obj.getAge());
		
		
		Return2 obj2 = new Return2();
		
		obj2.getTest(0);
		obj2.getTest(1);
		
		System.out.println(obj2.getName(0));
		System.out.println(obj2.getName(1));
		
		
	}

}

class Return{
	String getName()
	{
		return "구교민";
	}
	int getAge()
	{
		return 25;
	}
	
}

class Return2{
	
	void getTest(int type)
	{
		System.out.println("getTest() 메서드 시작");
		
		if(type==1)
		{
			return;
		}
		
		System.out.println("getTest() 메서드 끝");
		
	}
	
	String getName(int type)
	{
		if (type ==1)
		{
			return "";
		}
		return "구교민";
		
		
	}
	

}

//출력 결과
/*
이름은 : 구교민
나이는 : 25
이름은 : 구교민
나이는 : 25
getTest() 메서드 시작
getTest() 메서드 끝
getTest() 메서드 시작
구교민

 */
