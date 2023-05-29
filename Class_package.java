package myPackage;

import myPackage.test.TestPackage; // 이런식으로 클래스를 import 해와도 됨. 

import myPackage.test.*; // 와일드 카드를 쓰면 test패키지에있는 클래스 전부를 한번에 import. 

public class Class_package {
	
	public static void main(String args[])
	{
		
		
	myPackage.test.TestPackage test = new myPackage.test.TestPackage();
	
	
	test.method();
	
	}

}

// 패키지란, 한 마디로 폴더라고 생각하면 됨. 클래스들을 폴더 별로 묶어서 관리하기 위한 단위이다. 클래스명이 같아도 패키지 명이 다르면 다른 클래스이다. 

// 패키지를 상위, 하위로 구분할때는 .을 씀. 예를 들어, package test1.test2.test3; 패키지라면, test1아래 있는, test2 아래 있는 test3 package라는 뜻.

// import 

// 같은 패키지에 있는 클래스들은 바로 객체를 생성하거나 사용할 수 있지만, 다른 패키지에 있는 클래스를 사용하려면 패키지의 이름까지 전부 기술해야 사용할 수 있다.

// 패키지 이름이 길어지면 지저분하니까 import를 사용해서 클래스를 정의할 수 있다. 

//출력 결과
/*
myPackage.test 패키지의 TestPackage 클래스

 */
