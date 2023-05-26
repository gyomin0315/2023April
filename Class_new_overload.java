package myPackage;

public class Class_new_overload {
	
	public static void main(String args[])
	{
	
	
	Student stu1 = new Student();
	
	Student stu2 = new Student("구교민");
	
	Student stu3 = new Student("구교민",4);
	
	Student stu4 = new Student("구교민",4,"S/W보안");
	
	stu1.name = "구교민1";
	
	stu1.grade = 5;
	
	stu1.department = "H/W보안";
	
	stu2.grade = 6;
	
	System.out.println(stu1.department);
	
	System.out.println(stu2.grade);
	
	}
}

//출력 결과
/*
H/W보안
6

 */

// 생성자도 오버로딩 가능. 
