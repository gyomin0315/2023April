package myPackage;

public class Continue_exercise {
	
	public static void main(String [] args)
	{
		for(int i=0;i<10;i++)
		{
			if(i==5)
				continue;
			
			System.out.println("i = " + i);
			
		}
		
	}

}

//출력 결과
/*
i = 0
i = 1
i = 2
i = 3
i = 4
i = 6
i = 7
i = 8
i = 9

 */

// continue문도 C언어와 마찬가지로, continue를 만나게되면, 해당 반복건만 중지, 아래 코드를 실행하지 않고 바로 다음 반복으로 넘어간다 (증감식 부분으로). 
