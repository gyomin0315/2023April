package myPackage;

public class Array_exercise_5 {
	
	public static void main(String args[])
	{
		// simple for문. 값을 읽을 수만 있고, 변경할 수 없다. 
		
		int arr[] = {1,2,3,4,5};
		
		// 기존에는 배열의 출력을 이렇게 했다면,
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		// simple for문을 쓰게 되면, 아래와 같이 간편하게 쓸 수 있음.
		
		for(int number : arr) // 앞쪽은 배열을 넣을 변수 선언, 뒤는 반복 가능한 배열. 이 배열의 첫번째 요소부터 차례대로 number에 대입된다. 
		{
			System.out.print(number + " ");
		}
		
		String [] names = {"홍길동","이순신","김유신"};
		int score[] = {90,80,70};
		
		int i=0;
		
		
		for(String names2 : names)
		{
			System.out.print(names2 + ":" + score[i]);
			
		}
		
		
		
	
	}

}

//출력 결과
/*
1 2 3 4 5 
1 2 3 4 5 
 */
