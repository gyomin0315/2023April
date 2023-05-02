package myPackage;

public class While_exercise {
	
	public static void main(String [] args)
	{
		int sum = 0;
		int i=1;
		
		while(i<=100)
		{
			sum +=i;
			i++;
		}
		
		System.out.println("합계 : " + sum);
		
		int sum2 = 0;
		int i2 =1;
		
		do
		{
			sum2 +=i;
			i2++;
			
			
			
			
		}while(i<=100); // do while문은 끝에 while(조건식) 하고 ; 붙이는거 잊지 말것 !
		
		System.out.println("합계 2 : " + sum2);
		
		int a = 10;
		
		do
		{
			System.out.println("a = " + a);
		}while(a<10);
	}

}

//출력 결과
/*
합계 : 5050
합계 2 : 101
a = 10

 */

// while, do while문은 C와 같음. 
