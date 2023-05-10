package myPackage;

public class Array_exercise_3 {
	
	public static void main(String args[])
	{
		int matrix [][] = new int[3][3];
		
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[0][2] = 3;
		matrix[1][0] = 4;
		matrix[1][1] = 5;
		matrix[1][2] = 6;
		matrix[2][0] = 7;
		matrix[2][1] = 8;
		matrix[2][2] = 9;
		
		int matrix2[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		
		System.out.println("첫번째 2차원 배열");
		
		for(int i=0;i<matrix.length;i++) // 이때, matrix.length =3임. => 행의 갯수를 뜻함.
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
		}
		System.out.println();
		System.out.println("두번째 2차원 배열");
		
		for(int i=0;i<matrix2.length;i++) // 이때, matrix.length =3임. => 행의 갯수를 뜻함.
		{
			for(int j=0;j<matrix2[i].length;j++)
			{
				System.out.print(matrix2[i][j] + " ");
			}
		}
		
		
		// 3차원 배열도 사실상 2차원 배열과 똑같음. 
		
		int arrInt[][][] = new int[3][3][3];
		
		//System.out.println(arrInt[0].length);
		
		System.out.println();
		
		System.out.println("3차원 배열");
		
		int i,j,k;
		
		int value =0;
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				for(k=0;k<3;k++)
				{
					arrInt[i][j][k] = ++value;
					System.out.print(arrInt[i][j][k] + " ");
				}
			}
		}
		
		

		
	}

}

//출력 결과
/*
첫번째 2차원 배열
1 2 3 4 5 6 7 8 9 
두번째 2차원 배열
1 2 3 4 5 6 7 8 9 
3차원 배열
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 

 */
