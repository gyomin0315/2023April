package myPackage;

public class Lottery_system {

	public static void main(String args[])
	{
		// 로또 시스템 만들어보자.
		// i) 로또 번호를 담아둘 길이가 6개인 정수 타입 변수 생성.
		// ii) 1~45까지의 번호 중에 하나를 뽑는다.
		// iii) 만약 뽑은 번호가 배열에 있다면 다시 뽑고, 없다면 배열에 넣는다.
		// iv) 6개의 번호를 다 뽑을 때 까지 반복한다.
		// v) 6개의 번호 출력.

		int number [] = new int[6];

		int i;

		int j=0;

		boolean tf=true;

		while(j<6)
		{

			int lotto_number = (int)(Math.random()*45); // 0 나올수 있음에 주의

			if(lotto_number!=0)
			{

				for(i=0;i<6;i++)
				{
					if(lotto_number==number[i])
					{
						tf = false;
						break;
					}
					else
					{
						tf = true;

					}

				}
				
				
			}

			if(tf == true)
			{
				number[j] = lotto_number;
				j++;
			}

		}

		// 정렬 이렇게 해서는 안됨. 

		/*
		for(t=0;t<5;t++)
		{
			if(number[t]>number[t+1])
			{
				int temp=0;
				
				temp = number[t];
				number[t] = number[t+1];
				number[t+1] = temp;
				
				
			}
		}
		*/
		
		// 정렬 파트
		
		int t,y;
		
		for(t=0;t<6;t++)
		{
			for(y=t+1;y<6;y++)
			{
				if(number[t]>number[y])
				{
					int temp2;
					temp2 = number[t];
					number[t] = number[y];
					number[y] = temp2;
					
					
					//break;
				}
			
				
			}
		}

		for(int k=0;k<6;k++)
		{
			System.out.println(number[k]);
		}


	}
}

//출력 결과
/*
3
21
24
28
32
34

 */
