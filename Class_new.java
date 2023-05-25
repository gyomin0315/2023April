package myPackage;

public class Class_new {
	
	public static void main(String args[])
	{
	
	Class_new_studentclass stu = new Class_new_studentclass("구교민",4,"정보통신전자공학부");
	
	Class_new_studentclass stu2 = new Class_new_studentclass("구교민2",7,"정보보안학과");
	
	System.out.println(stu.name);
	System.out.println(stu.grade);
	System.out.println(stu.department);
	
	System.out.println(stu2.name);
	System.out.println(stu2.grade);
	System.out.println(stu2.department);
	
	Class_new_studentclass stu0 = new Class_new_studentclass(); // 매개변수가 있는 생성자를 정의한 경우, 기본 생성자가 자동으로 추가되지 않는다. 그래서 기본 생성자 직접 Class_new_studentclass에서 정의 해줘야함. 
	
	
	}

}



// 클래스를 이용해서 객체를 생성할때, new 생성자를 통해 만든다. ex ) Member member = new Member() -> Member라는 클래스의 member라는 새로운 객체를 만들었다. 

// .java파일을 만들고 .class파일로 컴파일될때, 기본 생성자 클래스명()이 자동으로 생긴다. 이 생성자를 실행해서 객체를 생성시킬 수 있다.

// But, 기본 생성자가 아닌, class안에서 직접 생성자를 정의할 수 있음. 이때, 직접 생성자는 생성자명이 클래스명과 동일하고, 리턴값이 없다. Class_new_studentclass.java 참고.

//출력 결과
/*
구교민
4
정보통신전자공학부
구교민2
7
정보보안학과

*/
