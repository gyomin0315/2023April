package myPackage;

import java.util.*;

public class Switch_and_For {

	public static void main(String[] args)
	{
		//String addr = "서울";

		System.out.println("살고 있는 도시를 입력하시오 : ");
		
		Scanner sc = new Scanner(System.in);
		

		while(true)
		{
			String addr = sc.next();
		
			
			switch(addr)
			{
			case "서울":
				System.out.println("저희 집은 서울입니다.");
				break;
			case "부산":
				System.out.println("저희 집은 부산입니다.");
				break;
			case "대전":
				System.out.println("저희 집은 대전입니다.");
				break;
			case "세종":
				System.out.println("저희 집은 세종입니다.");
				break;
			default :
				System.out.println("다시 입력하시오 : ");
				break;
				//Scanner scan = new Scanner(System.in);
				//addr = sc.next();


			}
			
			System.out.println(addr);
			
			if(addr=="서울\n"||addr=="부산\n"||addr =="대전"||addr =="세종")
			{
				break;
				
			}




		}

		System.out.println("끝");

	}

}


// switch()의 괄호 안에 들어갈 수 있는 자료형은 byte, short, int, char, String만 가능하다. 

// 기본 책의 프로그래밍에 더해, 추가적으로 입력을 받아서 출력하는 프로그램 작성하려 했으나, while문에서 break가 안되는것 같다... 이유를 찾아봐야 할듯.

//출력 결과
/*
살고 있는 도시를 입력하시오 : 
서울
저희 집은 서울입니다.
서울

 */

