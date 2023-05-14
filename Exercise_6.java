package myPackage;

public class Exercise_6 {
	
	public static void main(String args[])
	{
		//1. 다음 2차원 배열의 길이와 2번 인덱스의 길이는 ? 4, 3
		
		int [][] arr = {{1},{1,2},{1,2,3},{1,2,3,4}};
		
		System.out.println("arr의 길이 : " + arr.length);
		
		System.out.println("arr[2]의 길이 : " + arr[2].length);
		
		// 2. 배열에 담긴 점수들의 합계 점수와 평균 점수를 출력하는 코드를 완성하시오. 
		
		int [] arr2 = {90,80,70,85};
		
		int sum =0;
		double average =0;
		
		
		for(int i=0;i<arr2.length;i++)
		{
			sum += arr2[i];
			
			average += (double)arr2[i]/arr2.length; // arr2[i]/arr2.length가 int형 연산이기 때문에, average에 들어갈때 소숫점을 버리고 들어가는거 생각. double로 강제 형변환 해줬음.
			
			
			
		}
		
		System.out.println("합계는 :" + sum + " 평균은 : " + average);
		
		// 3. 하나의 배열에 1부터 10까지 10개의 정수가 저장되어 있다. 각각의 값을 다른 배열의 해당 인덱스 값에 제곱값을 대입하는 코드 완성하시오. 
		
		int arr3[] = {1,2,3,4,5,6,7,8,9,10};
		
		int arr4[] = new int[10];
		
		for(int i=0;i<arr3.length;i++)
		{
			
			arr3[i] =(int) Math.pow(arr3[i], 2); // Math.pow라는 메소드 사용. 
			
			System.out.println("arr3 = " + arr3[i]);
			
		}
		

		
		
	}

}

//출력 결과
/*
arr의 길이 : 4
arr[2]의 길이 : 3
합계는 :325 평균은 : 81.25
arr3 = 1
arr3 = 4
arr3 = 9
arr3 = 16
arr3 = 25
arr3 = 36
arr3 = 49
arr3 = 64
arr3 = 81
arr3 = 100
 */
