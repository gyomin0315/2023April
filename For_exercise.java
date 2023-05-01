package myPackage;

public class For_exercise {
	
	public static void main(String[] args)
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("i= " + i);
		}
		
		int sum = 0;
		
		for(int i=0;i<=100;i++)
		{
			sum += i;
		}
		
		System.out.println(sum); // sum = 0+1+2+3+...+99+100
		
		
	}

}

//출력 결과
/*
i= 0
i= 1
i= 2
i= 3
i= 4
i= 5
i= 6
i= 7
i= 8
i= 9
5050
*/
