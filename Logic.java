
public class Logic {
	
	
	
	public static void main(String[]args)
	{
		int a = 10;
		int b = 5;
		
		System.out.println(a>b&&a==10);
		System.out.println(a>b&&a==b);
		
		System.out.println(a>b||a==b);
		System.out.println(a<b||a==b);
		
		System.out.println(a>b^a==10); // XOR연산
		System.out.println(a>b^a==b);
		
		System.out.println(!(a>b));
		System.out.println(!(a<b));
		
		
	}
	
}

//출력 결과
/*
true
false
true
false
false
true
false
true



*/

// C와 똑같음.



