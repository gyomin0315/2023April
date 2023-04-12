
public class Escape_example {
	
	public static void main(String[]args)
	{
		
		String greet = "안녕하세요,\n저는 \"구교민\"입니다.";
		String greet2 = "\t 반갑습니다.";
		
		System.out.println(greet);
		System.out.println(greet2);
	}

}

//출력 결과
/*
안녕하세요,
저는 "구교민"입니다.
	 반갑습니다.

 */

// 제어문자 : escape 문자라고도 함. 

// \n : 줄바꿈
// \t : tab
// \ + 특정 문자 (',",\) : 앞에 오는 \가 말 그대로 뒤에있는 문자의 기능을 없앤다의 뜻이 됨.
