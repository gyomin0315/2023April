package myPackage;

import java.util.Scanner;

public class Switch_and_For_3 {

	public static void main(String[] args)
	{
		//String addr = "서울";

		System.out.println("Write the city where you live");
		
		Scanner sc = new Scanner(System.in);
		

		while(true)
		{
			
			String addr = sc.next();
			
			//int addr = sc.nextInt();
		
			
			switch(addr)
			{
			case "Seoul":
				System.out.println("I live in Seoul.");
				break;
			case "Busan":
				System.out.println("I live in Busan.");
				break;
			case "Daejeon":
				System.out.println("I live in Daejeon.");
				break;
			case "Sejong":
				System.out.println("I live in Sejong.");
				break;
			default :
				System.out.println("Write again.");


			}
			
		
			if(addr.equals("Seoul")||addr.equals("Busan")||addr.equals("Daejeon")||addr.equals("Sejong"))
			{
			    break;    
			}

		


		}

		System.out.println("The end");

	}
	}


//출력 결과
/*
Write the city where you live
Korea
Write again.
Seoul
I live in Seoul.
The end


 */

// if 문 안에서 String 비교를 addr == "Seoul" 과 같이 하는게 아니라, addr.equals("Seoul") 과 같이 하면 해결. equals는 같냐 같지 않냐를 봐주는 함수임.


