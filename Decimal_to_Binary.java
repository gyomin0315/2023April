
public class Decimal_to_Binary {
	
	
	
	public static void main(String[]args)
	{
		System.out.println("2:"+Integer.toBinaryString(2));
		System.out.println("2:"+Integer.toBinaryString(2));
		
		System.out.println("2&3 :" + (2&3));
		System.out.println("2|3 :" + (2|3));
		System.out.println("2^3 :" + (2^3));
		System.out.println("~3 :" + ~3);
		
		System.out.println("~3을 이진수로 :" + Integer.toBinaryString(~3));
		
		System.out.println(Integer.toBinaryString(~3).length());
		
		System.out.println(Integer.MAX_VALUE);
		
		
		
	}
	

	
}

//출력 결과
/*
2:10
2:10
2&3 :2
2|3 :3
2^3 :1
~3 :-4
~3을 이진수로 :11111111111111111111111111111100
32
2147483647


*/

// Integer.toBinaryString(내가 2진수로 바꿀 10진수 숫자.)를 통해, 10진수 수를 2진수로 바꿀수 있다.

// 비트연산은 C언어와 동일. C언어와 동일하게 int형은 4byte, 32bit로 이루어져있고, MSB는 0이면 양수, 1이면 음수임. C와 동일하게 2의 보수 사용. 그래서 ~3을 하게되면 -4가 나오게 됨. 

// 



