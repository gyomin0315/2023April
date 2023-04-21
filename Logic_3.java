
public class Logic_3 {
	
	
	
	public static void main(String[]args)
	{
		int a = 10;
		int b = 0;
		
		//System.out.println(b>0&(a/b)>0);
		System.out.println(b>0&&(a/b)>0);
		
	}
	

	
}

//출력 결과
/*
 * 
-> &하나만 썼을때. 왼쪽, 오른쪽 둘다 확인함. 0으로 나눌수는 없으니, error뜸. 
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Logic_2.main(Logic_2.java:11)
	
-> &&썼을때. 왼쪽만 확인. 	
false


*/

// AND 나 OR연산을 할때는 &&, || 쓰기를 권장. 



