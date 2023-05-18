package myPackage;

public class Car_main_exercise {
	
	public static void main(String args[])
	{
		Class_exercise_2 tico = new Class_exercise_2(); // Class_exercise_2라는 클래스에 대한 tico라는 변수 선언. 앞에서 만들었던 Class_exercise_2를 여기 main안에서 사용
		
		Class_exercise_2 pride = new Class_exercise_2();
		
		tico.color = "화이트";
		
		tico.company ="현대";
		
		tico.type = "경차";
		
		pride.color = "블랙";
		
		pride.company = "BMW";
		
		pride.type = "중형차";
		
		tico.go(); // go라는 함수 만들었던거 호출
		
		pride.go();
		
		System.out.println(tico.color);
		
		System.out.println(tico.company);
		
		System.out.println(tico.type);
		
		System.out.println(pride.color);
		
		System.out.println(pride.company);
		
		System.out.println(pride.type);
		
		System.out.println();
		
		Class_exercise_2 cars[] = new Class_exercise_2[3];
		
		Class_exercise_2 Avante = new Class_exercise_2();
		
		Avante.color = "초록";
		
		Avante.company ="현대";
		
		Avante.type = "세단";
		
		for (int i=0;i<cars.length;i++)
		{
			cars[i] = Avante;
			
			
		}
		
		System.out.println("두번째 차의 색은 ? :" + cars[2].color );
		
		cars[0].color = "블랙";
		
		System.out.println("두번째 차의 색은 ? :" + cars[2].color );
		

		
	}

}


//출력 결과
/*
전진하다.
전진하다.
화이트
현대
경차
블랙
BMW
중형차

두번째 차의 색은 ? :초록
두번째 차의 색은 ? :블랙

 */

// 클래스 안에서 선언했던 변수들을 호출해서 사용하는 방법은 C와 같은듯. 

// 두번째 프로그램에서 차의 색이 바뀐 이유는, 배열도 참조자료형이기 때문에, cars가 참조 자료형임. cars[0],cars[1],cars[2] 모두 같은 값을 가리키고 있고, 모두 같은 주솟값을 가짐. 그러므로, cars[0] 의 값만 바꿔줘도, 나머지도 다 바뀜. 

// 정확하게 얘기하면, 값이 저장된 곳은 한군데고, 이 값을 바꾸게 되면, 이 값을 참조하고 있는 모든 변수도 바뀐 값을 참조하게 됨. 


