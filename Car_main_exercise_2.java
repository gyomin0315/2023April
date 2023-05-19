package myPackage;

public class Car_main_exercise_2 {
	
	public static void main(String args[])
	{
		Class_exercise_2 cars[] = new Class_exercise_2[3];
		
		for(int i=0;i<cars.length;i++)
		{
			
			cars[i] = new Class_exercise_2();
			
			cars[i].color = "white";
			cars[i].company = "Hyundai";
			cars[i].type = "Sedan";
			
		}
		
		System.out.println("0번 인덱스 color : " + cars[0].color);
		System.out.println("1번 인덱스 color : " + cars[1].color);
		System.out.println("2번 인덱스 color : " + cars[2].color);
		
		cars[0].color = "Black";
		
		System.out.println("0번 인덱스 color : " + cars[0].color);
		System.out.println("1번 인덱스 color : " + cars[1].color);
		System.out.println("2번 인덱스 color : " + cars[2].color);
		
		
		
		
		
	}

}

//출력 결과
/*
0번 인덱스 color : white
1번 인덱스 color : white
2번 인덱스 color : white
0번 인덱스 color : Black
1번 인덱스 color : white
2번 인덱스 color : white
 */


// 여기에서 다 Black으로 바뀌지 않은 이유는, cars[0],cars[1],cars[2] 가 모두 다른 객체이기 때문. for loop안에서 cars[i] 를 계속 새로운 객체로 선언했음. 


// 즉, 클래스는 사용자 정의 자료형이고, 참조 자료형이기 때문에, 참조 자료형은 주소값을 저장하고, 독립된 별도의 객체를 생성하려면 new 연산자를 통해 다른 객체로 계속 생성해줘야 한다. 
