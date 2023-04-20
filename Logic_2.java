
public class Logic_2 {
	
	
	
	public static void main(String[]args)
	{
		int a = 10;
		
		int b = 5;
		
		System.out.println(a==b & test());
		
		System.out.println(a==b && test());
		
	}
	
	public static boolean test() {
		
		System.out.println("test()메서드 실행됨.");
		
		return true;
		
		
	}
	
}

//출력 결과
/*
test()메서드 실행됨.
false
false

*/

// && 와 &의 차이는, &&는 왼쪽항이 false라면, 오른쪽항은 확인하지 않는다. 이미 결과값이 정해져 있기 때문. OR연산 || 도 마찬가지로, 왼쪽항이 true라면, 오른쪽은 확인 하지 않음. shortcut이라고 함. 



