package myPackage;

public class Array_exercise_2 {
	
	public static void main(String[] args)
	{
		System.out.println("첫번째 값 : " + args[0]);
		System.out.println("두번째 값 : " + args[1]);
		
		// 다차원 배열
		
		int number[][] = new int[3][3];
		
		int k=0;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				number[i][j] = k;
				k++;
				System.out.println("number [" + i + "][" + j + "] = " + k);
			}
		}
		
		int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}}; // 이런식으로도 초기화 가능 !
		
		

		
	}
	
	


}

// 출력 결과
/*
첫번째 값 : Piano
두번째 값 : Guitar
number [0][0] = 1
number [0][1] = 2
number [0][2] = 3
number [1][0] = 4
number [1][1] = 5
number [1][2] = 6
number [2][0] = 7
number [2][1] = 8
number [2][2] = 9
 */

// 전에 했던거 다시 나왔음 ! 초록색 실행 버튼 옆 화살표 -> Run configurations -> Arguments -> Program arguments 에서 입력하면 됨. 개행문자 기준으로 배열에 입력됨. 

// 다차원배열을 C언어와 똑같음. 초기화 해주는 방법 기억하기. 
