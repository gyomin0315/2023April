package myPackage;

import java.util.Arrays;

public class Array_exerccise_7 {
	
	public static void main(String args[])
	{
		
		// 배열의 값을 그대로 이어받으면서, 주솟값이 별개여야하면 어떻게 해야 할까? => Arrays.Copyof()라는 메소드 사용하면 됨.
		int arr1 [] = {1,2,3};
		
		int arr2[] = Arrays.copyOf(arr1, 3);
		
		System.out.println(arr1 == arr2);
		
		System.out.print("arr1 = ");
		
		for(int i=0;i<arr1.length;i++)
		{
		
			System.out.print(arr1[i] +" ");
		}
		System.out.println();
		
		
		System.out.print("arr2 = ");
		
		for(int i=0;i<arr1.length;i++)
		{
		
			System.out.print(arr2[i] +" ");
		}
		
		System.out.println();
		
		
		arr2[0] = 4;
		
		System.out.println("arr2[0] = 4");
		
		System.out.print("arr1 = ");
		
		for(int i=0;i<arr1.length;i++)
		{
		
			System.out.print(arr1[i] +" ");
		}
		
		System.out.println();
		
		System.out.print("arr2 = ");
		
		for(int i=0;i<arr1.length;i++)
		{
		
			System.out.print(arr2[i] +" ");
		}

	}

}

//출력 결과
/*
false
arr1 = 1 2 3 
arr2 = 1 2 3 
arr2[0] = 4
arr1 = 1 2 3 
arr2 = 4 2 3

 */
