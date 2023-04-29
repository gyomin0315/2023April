package myPackage;

import java.util.Scanner; 

public class Switch_exercise {
	
	public static void main(String [] args)
	{
		System.out.println("점수를 입력하시오 : ");
		Scanner scan = new Scanner(System.in);
		
		//String score1 = scan.nextLine();
		
		int score = scan.nextInt();
		
		//int score = 90;
		
		String grade = "";
		
		switch (score)
		{
		case 90 :
			grade = "A";
			break;
		case 80 :
			grade = "B";
			break;
			
		case 70 :
			grade = "C";
			break;
			
		case 60 :
			grade = "D";
			break;
		default :
			System.out.println("다시 입력하시오 :");
		
		
		
		
		}
				
		
		System.out.println("당신의 점수는 : " + grade + ".");
		
		//System.out.println(score1);
		
		
	}
	

}

//출력 결과
/*
점수를 입력하시오 : 
80
당신의 점수는 : B.

 */

// 자바에서 scanf 사용하는 방법. 

// i) global 영역에서 import java.util.Scanner 로 java.util의 Scanner 기능을 가져옴. import java.util.*로 모든 기능을 다 가져올 수 도 있음.

// ii) Scanner sc = new Scanner(System.in)

// sc는 클래스명, new는 새로운 객체를 heap 메모리에 할당하겠다는 의미. System.in은 화면에서 입력받겠다는 의미. 입력값을 Byte단위로 읽는다. 

// int number = sc.nextInt() 와 같이 입력한 수를 저장한다.

// Scanner의 메소드 

// sc.next() : String을 token(공백문자, Tab, enter) 기준으로 읽는다. (한 단어 입력받을때 사용)

// sc.nextLine() : String을 enter기준으로 읽는다. (한 문장.)

// 그 외에 nextInt(), nextboolean(), nextDouble() 등이 있다. 


