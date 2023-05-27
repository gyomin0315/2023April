package myPackage;

public class Class_this_main {
	
	public static void main(String args[])
	{
		Class_this c1 = new Class_this();
		Class_this c2 = new Class_this("중형차");
		Class_this c3 = new Class_this("현대","대형차");
		Class_this c4 = new Class_this("black","기아","화물차");
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		System.out.println("c4 = " + c4);

	}

}

//출력 결과
/*
c1 = white-Kia-경차
c2 = white-Kia-중형차
c3 = white-현대-대형차
c4 = black-기아-화물차

 */
