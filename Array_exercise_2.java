package myPackage;

public class Array_exercise_2 {
	
	public static void main(String args[])
	{
		// 로또 시스템 만들어보자.
		// i) 로또 번호를 담아둘 길이가 6개인 정수 타입 변수 생성.
		// ii) 1~45까지의 번호 중에 하나를 뽑는다.
		// iii) 만약 뽑은 번호가 배열에 있다면 다시 뽑고, 없다면 배열에 넣는다.
		// iv) 6개의 번호를 다 뽑을 때 까지 반복한다.
		// v) 6개의 번호 출력.

		int full_number[] = new int[6];

		int i=0;
		
		int idx=0;

		while(i<6)

		{
			
			boolean tf = true;

			int number = (int) (Math.random()*45); // 0이 나올수도 있음에 주의.
			
			for(i=0;i<=idx;i++)
			{
				if(full_number[i]==number)
				{
					tf = false;
					break;
				}
			}

			if(tf == true && number!=0)
					
			{
				full_number[idx] = number;
				idx++;
			}
			
			if(idx==6) break;
			
			

		}
		
		for(int j=0;j<6;j++)
		{
			System.out.println(full_number[j]);
		}


	}

}

// 좀 어려웠어서 내일 천천히 다시 살펴보고 첨부터 끝까지 짜볼것. boolean을 이용한 방법 기억해놓을것. 내일 오름차순으로 정렬하는법까지 해결. 

//출력 결과
/*
42
12
3
26
19
18

 */
