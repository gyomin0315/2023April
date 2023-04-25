package myPackage;

public class Exercise {
	
	public static void main(String[] args)
	{
		
		// 3. 아래 코드의 출력 결과 예상.
		
		int var = 7-1*20/5;
		
		System.out.println(var);
		
		//1. 한반에 27명인 학급이 있다. 색연필 60개가 있다면, 각 학생이 받을 수 있는 색연필 수와 나눠주고 남은 색연필 수를 출력하시오.
		
		System.out.println("각 학생에게 나눠줄 수 있는 색연필의 갯수는 : " + func1(60,27));
		System.out.println("남은 색연필의 갯수는 : " + func2(60,27));
		
		//2. 6세 이상 탑승 가능, (단, 키가 120cm이상이면 보호자 동반하에 탑승 가능), 키 120cm이상 탑승 가능, 심장관련 질환자 탑승 불가. 탑승 가능하면 탑승 가능하다고, 불가능하다면 불가능하다고 출력하는 코드 작성.
		
		int age=7;
		int height=130;
		boolean parent=false;
		boolean heartdesease=false;
		
		
		String available = heartdesease==false&&height>=120&&(age>=6||age<6&&height>=120&&parent==true) ? "탑승 가능" : "탑승 불가능";
		
		System.out.println(available);
		
	}
	
	private static int func1(int a, int b)
	{
		int result = a/b;
		return result;
	}
	
	private static int func2(int a,int b)
	{
		int result = a%b;
		return result;
		
		
	}
	

}

//출력 결과
/*
3
각 학생에게 나눠줄 수 있는 색연필의 갯수는 : 2
남은 색연필의 갯수는 : 6
탑승 가능


 */

// 1번 문제의 경우, 새로 함수를 만들어서 프로그램 구현. 사용자 정의 함수는 class안에서만 작동되도록 private로 선언했고, int형 값을 return 해주도록 설정, 매개변수도 int형 2개를 받아올수 있도록 설정함. 


