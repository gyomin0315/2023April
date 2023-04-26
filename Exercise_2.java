package myPackage;

public class Exercise_2 {
	
	public static void main(String[] args)
	{
		
		// 1. 윤년인지 아닌지 판단하시오. i) 연도를 4로 나눠 떨어지면 윤년. ii) 100으로 나누어 떨어지는 연도는 윤년이 아님. iii) 400으로 나누어 떨어지면 윤년
		
		int year = 2023;
		
		String Leap_year = year%4==0&&year%100!=0||year%400==0 ? "윤년" : "윤년 아님";
		
		System.out.println(Leap_year);
		
		// 2. 187000원을 지불하려고 할때, 5만원권, 1만원권, 5천원권, 1천원권 지폐를 가장 적은 지폐수량으로 지불하는 코드를 작성하시오 
		
		int price = 187000;
		
		System.out.println("5만원권은 : " + (int)price/50000 + "장");
		
		price %= 50000;
		
		System.out.println("1만원권은 : " + (int)price/10000 + "장");
		
		price %= 10000;
		
		System.out.println("5천원권은 : " + (int)price/5000 + "장");
		
		price %= 5000;
		
		System.out.println("1천원권은 : " + (int)price/1000 + "장");
		
		
		// 3. int형 number에서, 십의 자리 이하를 버리는 코드 작성.
		
		int number = 1234;
		
		int result = number - (number%100);
		
		System.out.println(result);
		
		

		
	}
	
	

}

//출력 결과
/*
윤년 아님
5만원권은 : 3장
1만원권은 : 3장
5천원권은 : 1장
1천원권은 : 2장
1200

 */


// 1번문제는 Leap_year를 boolean으로 정해서, true, false로 나오게끔 해도 됨. 
