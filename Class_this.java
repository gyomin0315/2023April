package myPackage;

public class Class_this {
	
		// 필드 
		String color;
		String company;
		String type;
		
		Class_this()
		{
			this("white","Kia","경차");
		}
		
		Class_this(String color, String company, String type)
		{
			this.color = color;
			this.company = company;
			this.type = type;
		}
		
		Class_this(String com, String t)
		{
			this("white",com,t);
		}
		
		Class_this(String t)
		{
			this("white","Kia",t);
		}
		
		// 아래는 toString 메소드를 재정의 . String 클래스 객체의 toString 메소드는 자신이 가진 값 그대로 리턴.
		// println()안에서 print해주기전, String으로 바꿀때 toString 사용할때 아래 코드 사용. 
		public String toString()
		{
			return color + "-" + company + "-" + type;
		}

}

// this는 객체 자신이라고 생각하면 됨. this는 필드명과 메소드의 매개변수 명이 같을 때 사용. 
