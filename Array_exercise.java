package myPackage;

public class Array_exercise {
	
	public static void main(String args[])
	{
		//int[] arrInt;
		int arrInt2[] = null;
		
		//System.out.println(arrInt[0]);
		//System.out.println(arrInt2[0]);
		
		// => 배열을 선언하는 방법은 2가지 있음. 또, 반드시 초기화 해줘야함.
		
		double[] arrInt = new double[5];
		
		// => 배열변수 arrInt에 new 연산자로 길이가 5개인 배열 객체를 생성. new 연산자는 객체를 생성해줌. (heap 영역에 메모리를 할당.) 즉, new 연산자로 생성된 객체는 같은 값을 가지고 있어도, 서로 다른 메모리 할당 받기 때문에 다른 객체로 인식.
		
		arrInt[0] = 1;
		arrInt[1] = 2;
		arrInt[2] = 3;
		arrInt[3] = 4;
		arrInt[4] = 5;
		
		System.out.println(arrInt);
		
		String[] arrStr = new String[5];
		
		System.out.println(arrStr);
		
		String arrStr2[] = {"구교민", "구교민2", "교민3"}; // []안에 사이즈를 입력해서 할당할수 없음. ex ) arrStr2[3] 이런식으로 사용 불가. 
		
		System.out.println("배열의 길이는 : " + arrStr2.length);
		
		for(int i=0;i<3;i++)
		{
			System.out.println(arrStr2[i]);
		}
		
		int number[] = new int[100];
		
		for(int i=0;i<30;i++)
		{
			number[i] = i;
			System.out.println(number[i]);
		}
		
		
		
	}

}


//출력 결과
/*
[D@3d012ddd
[Ljava.lang.String;@626b2d4a
배열의 길이는 : 3
구교민
구교민2
교민3
0
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29

// 자바에서의 주솟값을 의미. [는 1차원 배열이라는 뜻. [[이면 2차원 배열. @뒤 부터가 진짜 주솟값. I는 데이터형이 int형임을 의미. double형으로 바꾸게 되면 D로 나옴. 
// java.lang.String의 의미는, C언어는 문자열을 문자의 배열로 생각하지만, 자바는 String이라는 클래스를 문자열을 위해 별도로 제공. 이 String이라는 클래스는 java.lang에 포함되어서 나옴. 
 */
