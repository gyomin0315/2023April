package myPackage;

import java.util.Arrays;

public class Tenary_operator {
	
	public static void main(String args[])
	{
		int score = 80;
		
		String pass = score>=60 ? "합격" : "불합격";
		
		System.out.println(pass);
		
		System.out.println(args[0]);
		
		
		
	}
	
	
	

}

//출력 결과
/*
합격
*/

// 삼항 연산자의 사용은 C와 같음.

/*

public static void main(String[] args) 의 의미는 뭘까?

i) public : 제한자. 이 함수를 어디에서 접근할 수 있는지 범위 지정. main 함수는 어디서든 접근 가능해야 하므로 public을 씀.
			private, protected 도 가능. private는 같은 class안에서, protected는 같은 package안에서 접근 가능.
			
ii) static : 메모리 할당 영역. static영역, heap영역으로 나뉨. static은 고정된 이라는 뜻으로, static영역은 프로그램이 시작하고 끝날때까지 계속 메모리에 상주. 
			 heap영역은 프로그래머가 원할때, 원하는 만큼 메모리를 가져와서 사용. C는 메모리 사용 후 , 자동 반납 안되지만, Java는 사용 후, 메모리 해제를 알아서 Java virtual machine이 해줌.
			 이 기능을 garbage collectiond이라고 함. stack과 다른 점은, stack은 size가 정해져 있지만, heap은 사이즈가 정해져 있지 않아, 쓸 수 있는 메모리를 찾는데 시간이 좀 더 오래 걸림.

iii) void : 반환 값이 없다.

iv) String args[] : 매개변수 부분. main함수는 처음 수행되는 함수이기 때문에, 프로그램 외부에서 값을 입력 받을 수 있어야 하고, 그 값을 저장할 배열이 필요. 그래서 args라는 String 배열에 저장. 
					main 함수에 매개변수에 값을 입력하고 싶다면, Eclipse 왼쪽 목록중, 실행 시키고 싶은 파일 -> 우클릭 -> Run as -> Run Configuration -> Arguments -> Program Arguments에서 설정 가능.
					System.out.println(args[0,1,2...])로 확인 가능. 


 */


