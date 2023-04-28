package myPackage;

public class If_exercise_2 {
	
	public static void main(String [] args)
	{
		
		int math = 90;
		
		int eng = 95;
		
		if(math>=60)
		{
			if(eng>=60)
			{
				System.out.println("통과");
				
			}
			
		}
		else
		{
			System.out.println("탈락");
		}
		
		if(math<60||eng<60)
		{
			System.out.println("탈락");
		}
		else
		{
			System.out.println("통과");
		}
		
		
		about_switch();
		
		
	}
	
	
	private static void about_switch()
	{
		int number = 3;
		
		switch (number)
		{
		case 1:
			System.out.println("1번");
			break;
		case 2:
			System.out.println("2번");
			break;
		case 3:
			System.out.println("3번");
			break;
		default :
			System.out.println("다시 작성하시오");
		
		
		
		}
		
		
	}

}

//출력 결과
/*
통과
통과
3번

 */

// if문, case문은 C언어와 사용법 같음. 
