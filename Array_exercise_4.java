package myPackage;

import java.util.Arrays;

public class Array_exercise_4 {
	
	
	public static void main(String args[])
	{
		int arrInt [][] = new int[3][]; // 2차원배열에서부터는, 행의 크기만 초기화 하고, 열의 크기는 초기화 하지 않을 수 있음. 
		
		arrInt[0] = new int []{1}; // arrInt[0] = {1}; 과 같이 초기화 하는게 아니라, arrInt[0]의 새로운 객체를 만들어주겠다는 식으로, arrInt[0] = new int[]{1} 이렇게 만들어줘야함. 
		
		arrInt[1] = new int[] {1,2};
		
		arrInt[2] = new int[] {1,2,3};
		
		for(int i=0;i<arrInt.length;i++)
		{
			for(int j=0;j<arrInt[i].length;j++)
			{
				System.out.print(arrInt[i][j]);
			}
			
			System.out.println();
		}
		
		int arrInt2[] = {1,2,3};
		int arrInt3[] = new int[5];
		
	
		
		for(int i=0;i<arrInt2.length;i++)
		{
			arrInt3[i] = arrInt2[i];
			
			
		}
		
		for(int j=0;j<arrInt3.length;j++)
		{
			System.out.print("arrInt3[] = " + arrInt3[j] + "  "); // 배열중 비어있는 곳은 0으로 자동 초기화 되어있음. 
		}
		
		System.out.println();
		
		// 배열을 복사할때, 그냥 메소드를 사용해서 복사할 수도 있음 . arraycopy()메소드.
		
		int [] array = {7,8,9};
		
		int array2 [] = new int[5];
		
		System.arraycopy(array, 0, array2, 0, 3); // 출발지 배열, 출발 배열의 위치, 목적지 배열, 목적지 배열의 위치, 마지막으로 복사할 값의 길이. 
		
		
		for(int i=0;i<array2.length;i++)
		{
			System.out.println(array2[i]);
		}
		
		// 아니면, copyof() 메소드를 쓰면 더 쉽게 배열값 복사 가능.
		
		int array3 [] = {4,5,6};
		
		int array4[] = null;
		
		array4 = Arrays.copyOf(array3, 5); // array3의 길이를 5로 설정해서 그대로 array4에 복사해라.
		
		for(int i=0;i<array4.length;i++)
		{
			System.out.print(array4[i]);
		}
		
	
		
	}

}

//출력 결과
/*
1
12
123
arrInt3[] = 1  arrInt3[] = 2  arrInt3[] = 3  arrInt3[] = 0  arrInt3[] = 0  
7
8
9
0
0
45600
 */
