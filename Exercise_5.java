package myPackage;

import java.util.*;

public class Exercise_5 {
	
	public static void main(String[] args)
	{
		// i) 1부터 100까지의 정수 중, 5의 배수의 합계를 출력하는 프로그램 작성.
		int result1 =0;
		
		for(int i=1;i<=100;i++)
		{
			if(i%5==0)
			{
				result1 +=  i;
			}
		}
		
		System.out.println("합계 : " + result1 );
		
		// ii) 1부터 100까지의 수 중 짝수와 홀수의 합을 각각 구하시오.
		
		int result2=0 ,result3=0;
		
		for(int j=1;j<=100;j++)
		{
			if(j%2==0)
			{
				result2 += j;
			}
			else
			{
				result3 +=j;
			}
		}
		
		System.out.println("짝수의 합은 : " + result2);
		System.out.println("홀수의 합은 : " + result3);
		
		// iii) 두 개의 주사위의 두 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램 작성.
		
		int k,m;
		
		for(k=1;k<=6;k++)
		{
			for(m=1;m<=6;m++)
			{
				if(k+m==6)
				{
					System.out.println("(" + k + "," + m + ") = " + 6 );
				}
			}
		}
		
		// iv)*모양으로 탑 쌓기.
		
		int p,n;
		
		String star = "";
		
		for(p=0;p<5;p++)
		{
			
				star += "*";
			
			
			System.out.println(star);
		}
		
		// v) *모양으로 탑 쌓기 2.
		for(p=0;p<5;p++)
		{
			for(n=5;n>p;n--)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}

		// vi) *모양으로 탑 쌓기 3.

		System.out.println();

		int q,w,e;

		for(q=0;q<5;q++)
		{
			for(e=5;e>q;e--)
			{
				System.out.print(" ");
			}
			for(w=0;w<2*q+1;w++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		System.out.println();
		
		// vii ) 주사위의 눈이 6이 나올때까지 반복해서 굴리고, 눈이 6이되면 굴린 횟수 출력. 
		
		int freq=0;

		while(true)
		{
			
			int r = (int) (Math.random()*10); // int형으로 강제형변환 해줄때, 뒤에있는 애들을 꼭 ()로 묶어줘야함 ! 
		
			if(r<7&&r>0)
			{
				System.out.println("실행 결과 : " + r);
				freq++;
			}
			if(r==6)
				break;

		}
		System.out.println("실행 횟수 : " + freq);

	}

}

//출력 결과
/*
합계 : 1050
짝수의 합은 : 2550
홀수의 합은 : 2500
(1,5) = 6
(2,4) = 6
(3,3) = 6
(4,2) = 6
(5,1) = 6
*
**
***
****
*****
*****
****
***
**
*

     *
    ***
   *****
  *******
 *********

실행 결과 : 5
실행 결과 : 2
실행 결과 : 2
실행 결과 : 6
실행 횟수 : 4

 */

// Math.random()은 0에서 1까지 Random한 double형 실수를 출력 ! 
