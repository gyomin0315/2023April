package myPackage;

public class Class_method_overload {
	
	public static void main(String agrs[])
	{
	
	Operator op = new Operator();
	System.out.println(op.multiply(4,3));
	System.out.println(op.multiply(4.5,3));
	System.out.println(op.multiply(4.5,3.5));
	System.out.println(op.multiply(4,3.5));
	
	// println 메서드도 대표적인 오버로드 메소드임. 
	
	System.out.println(1);
	System.out.println(5.5);
	System.out.println((long)(100));
	System.out.println("구교민");
	System.out.println('a');
	System.out.println(true);
	System.out.println(new Class_method_overload());
	System.out.println(new int[5]);
	
	
	
	}
	
	
}

class Operator
{
	int multiply(int x, int y)
	{
		System.out.println("(int , int)");
		int result = x*y;
		return result;
		
	}
	double multiply(double x, int y)
	{
		System.out.println("(double , int)");
		double result = x*y;
		return result;
		
	}
	double multiply(double x, double y)
	{
		System.out.println("(double , double)");
		double result = x*y;
		return result;
		
	}
	double multiply(int x, double y)
	{
		System.out.println("(int , double)");
		double result = x*y;
		return result;
		
	}
	
	
}

//출력 결과
/*
(int , int)
12
(double , int)
13.5
(double , double)
15.75
(int , double)
14.0
1
5.5
100
구교민
a
true
myPackage.Class_method_overload@76ccd017
[I@182decdb

 */

//클래스 내에서 이름이 같은 메서드가 여러개 있는 걸 오버로딩이라고 함. 같은 이름을 가진 메서드이면서 매개변수의 자료형, 매개변수의 갯수, 순서 중 하나 이상이 달라야함. 

// 오버로딩을 하는 이유는, 매개변수를 다양하게 입력받게 하기 위함. 

// ctrl을 누른 상태로 println을 클릭하면, println 메소드가 오버로딩된 모습 확인할 수 있음. 

