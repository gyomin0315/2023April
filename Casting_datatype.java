
public class Casting_datatype {
	
	
	
	public static void main(String[]args)
	{
		int number = 10;
		long number2 = number; // int < long. 작은 크기의 데이터형은 큰 데이터형에 자동으로 담을 수 있응. 자동으로 형 변환 가능.
		
		System.out.println(number2);
		
		double pi = 3.14;
		
		int pi2 = (int)pi; // 강제형변환
		
		System.out.println(pi2); // 이떄, 값의 손실 발생. 
		
		double score = 100;
		int score2 = (int)score;
		
		System.out.println(score2); // 이떄는 값의 손실 발생 안함. 
		

	}
	
}

//출력 결과
/*
10
3
100
 */



