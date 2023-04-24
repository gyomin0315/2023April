package myPackage;

public class String_operation {
	
	public static void main(String [] args)
	{
		String name = "구교민";
		
		System.out.println("안녕하세요 저는" + name + "입니다." );
		
		int height = 170;
		
		System.out.println("저의 키는" + height + "cm입니다.");
		
		// String weight = 70;
		
		String weight = 70 + "";
		
		System.out.println("저의 몸무게는" + weight + "kg입니다.");
		
		int type1 = 30;
		String type2 = "30";
	
		String type3 = type1 + type2;
		
		System.out.println(type3);
		
		
	}
	

}

//출력 결과
/*
안녕하세요 저는구교민입니다.
저의 키는170cm입니다.
저의 몸무게는70kg입니다.
3030

*/


// JAVA에서 숫자는 문자열과 계산이 불가능 하나, print를 할때, 혹은 String 자료형에 넣을때는 자동으로 문자열형태로 형변환 된다. 

// 15,17라인에서도, 그냥 숫자 70을 weight에 넣을수는 없었지만, 70에 문자열을 + 해주면 70이 문자열로 자동 형변환된걸 볼 수 있음.

// 숫자는 문자열과 + 연산이 되면, 문자열로 자동형변환된다. 문자열이 숫자로 자동형변환 될 수는 없음. 


/*
 * -JAVA의 컴파일 방식-
 * 
 * .java파일을 JDK(java development kit)가 .class 파일로 컴파일한다. 
 * 이 .class 파일은 byte코드 파일로, 컴퓨터는 읽을 수 없고, JVM(java virtual machine)이 읽을 수 있다.
 * 이 .class를 JVM의 클래스로더에게 전달해주면, 클래스로더는 필요한 클래스들을 JVM의 메모리에 올린다.
 * 그 후, 실행엔진 (인터프리터, JIT)가 JVM의 메모리에 올라온 byte코드를 실행시킨다. 
 * 인터프리터 : byte코드 명령어를 하나씩 실행.
 * JIT : byte코드 전체를 컴파일하여 , binary 코드로 변경 후 실행. (훨씬 빠르다.)
 * 
 * 
 * 
 * 
 */
 
/*
 * 자바에서 클래스란 ? -> 설계도.
 * 클래스는 field (변수), 메소드(명령문의 집합. 함수)로 되어있다. 이 클래스가 메모리에 올라가면 instance라고 함. 
 * 이 클래스 안에서 여러 객체들이 생성됨. 객체들의 속성은 변수, 동작은 메소드로 볼 수 있다. 
 * 
 */




