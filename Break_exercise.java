package myPackage;

public class Break_exercise {
	
	public static void main(String[] args)
	{
		for(int i=0;i<=6;i++)
		{
			System.out.println("i = " + i);
			if(i==5)
			{
				break;
			}
		}
		
		
		for(int j=0;j<5;j++)
		{
			for(int k=0;k<5;k++)
			{
				System.out.println(" j = " + j + "\t" + "k = " + k);
				if(k==3)
				{
					break;
				}
			}
		}
		
		target:for(int g = 0;g<5;g++)
		{
			for(int y = 0;y<5;y++)
			{
				System.out.println(" g = " + g + "\t" + "y = " + y);
				if(y==2)
				{
					break target;
				}
			}
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
i = 5
 j = 0	k = 0
 j = 0	k = 1
 j = 0	k = 2
 j = 0	k = 3
 j = 1	k = 0
 j = 1	k = 1
 j = 1	k = 2
 j = 1	k = 3
 j = 2	k = 0
 j = 2	k = 1
 j = 2	k = 2
 j = 2	k = 3
 j = 3	k = 0
 j = 3	k = 1
 j = 3	k = 2
 j = 3	k = 3
 j = 4	k = 0
 j = 4	k = 1
 j = 4	k = 2
 j = 4	k = 3
 g = 0	y = 0
 g = 0	y = 1
 g = 0	y = 2

 */


// break문의 사용은 C와 똑같음. 단, 마지막 코드에서 target: 을 해준건 임의로 이름을 붙여준것. 이 이름을 통해, 그 이름의 부분을 break target; 과 같이 끊어줄 수 있음. 
