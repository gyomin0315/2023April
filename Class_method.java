package myPackage;

public class Class_method {
	
	public static void main(String args[])
	{
		Param p = new Param();
		
		p.add(10, 5);
		
		p.add2(10, 5);
		
		p.add3(1,2,3,4,5,6,7,8,9,10);
		
	}

}

class Param{
	
	void add(int x, int y)
	{
		int z = x+y;
		System.out.println(z);

	}
	
	void add2(double x, double y)
	{
		double z = x+y;
		System.out.println(z);
	}
	void add3(int ... x) // 매개변수가 몇개가 들어올지 모르겠다면, int ... x 와 같이 x를 매개변수의 배열과 같이 만들어서 사용할 수 있음. 
	{
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			sum += x[i];
		}
		System.out.println(sum);
	}
	
	
	
}

// 지역변수는 중괄호 안에서만 사용 가능. 그게 for문이라도. for문안에서 선언해줬다면, for문 밖에서는 쓸수 없음. 

// 메서드는 클래스 구성요소중, 기능을 담당. 

// main함수도 메서드라고 할 수 있음. 

// 메서드의 구조 :
/*
접근제한자(public, private) 리턴타입 메서드명 (매개변수) {
	
	실행문 
	.
	.
	.
	return 값;
}
*/

//출력 결과
/*
15
15.0
55
 */
