package myPackage;

import java.util.Scanner;

public class Switch_and_For_2 {

	public static void main(String[] args)
	{
		//String addr = "";

		System.out.println("살고 있는 도시를 입력하시오 : ");

		Scanner sc = new Scanner(System.in);


		while(true)
		{

			//String addr = sc.next();

			int addr = sc.nextInt();


			switch(addr)
			{
			case 1:
				System.out.println("저희 집은 서울입니다.");
				break;
			case 2:
				System.out.println("저희 집은 부산입니다.");
				break;
			case 3:
				System.out.println("저희 집은 대전입니다.");
				break;
			case 4:
				System.out.println("저희 집은 세종입니다.");
				break;
			default :
				System.out.println("다시 입력하시오 : ");
				addr = 5;

				//Scanner scan = new Scanner(System.in);
				//addr = sc.next();


			}


			if(addr==1||addr==2||addr==3||addr==4)
			{
				break;

			}

			System.out.println("끝");


		}
	}
}

//출력 결과
/*
살고 있는 도시를 입력하시오 : 
6
다시 입력하시오 : 
7
다시 입력하시오 : 
2
저희 집은 부산입니다.
끝

 */

// addr을 String이 아니라 int형으로 바꾸면 while문을 잘 빠져나오긴 한다. String으로 해서 안되는 이유는 계속 찾아봐야할듯. Github에 질문 함.


