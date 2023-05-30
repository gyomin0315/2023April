package myPackage.test;

import myPackage.*; // import 해주는거 반드시 까먹지 말 것 !

public class Class_access_modifier_ClassC {
	
	
	public static void main(String args[])
	{
		Class_access_modifier ca = new Class_access_modifier();
		ca.print();
		
		
		// ClassB cb = new ClassB(); 접근제한자 때문에 에러 
		
		
	}

}

//출력 결과
/*
여기는 ClassA

 */
