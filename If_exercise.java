package myPackage;

public class If_exercise {
	
	
	public static void main(String[] args)
	{
		int score = 70;
		
		System.out.println("시험 시작");
		
		if(score >=60)
		
			System.out.println("합격입니다.");
			
		
		else
		{
			
			System.out.println("불합격입니다.");
		}
		
		System.out.println("시험 종료");
		
		System.out.println();
		
		grade();
		
	}
	
	private static void grade() // 매개변수가 없을때는 void쓰지 말고 비워둬야 함. 
	{
		int score = 91;
		
		System.out.println("당신의 점수는 : " + score);
		
		String grade;
		
		if(score >=95)
		{
			grade = "A+";
		}
		else if(score >=90)
		{
			grade = "A";
		}
		else if(score >=85)
		{
			grade = "B+";
		}
		else if(score >=80)
		{
			grade = "B";
		}
		else if(score >=75)
		{
			grade = "C+";
		}
		else if(score >=70)
		{
			grade = "C";
		}
		else
		{
			grade = "F";
		}
		
		System.out.println("당신의 등급은 : " + grade + "입니다.");
		
		
	}

}

//출력 결과
/*
시험 시작
합격입니다.
시험 종료

당신의 점수는 : 91
당신의 등급은 : A입니다.

 
 */

// if절은 C와 똑같음. 
