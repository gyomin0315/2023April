package myPackage;

public class Array_exercise_6 {
	
	
	public static void main(String args[])
	{
		
		// 아래 프로그램은 값끼리 비교한게 아니라, 메모리 주소를 참조하고 있는 값을 비교한것임 ! name1과 name2의 
		String name1 = "구교민";
		String name2 = "구교민";
		
		System.out.println(name1 == name2);
		
		String name3 = new String("구교민");
		String name4 = new String("구교민");
		
		System.out.println(name3 == name4);
		
		
		
		
		int [] arr1 = {1,2,3};
		
		int [] arr2 = {1,2,3};
		
		System.out.println("arr1 == arr2 :" + (arr1==arr2)); // 당연히 false 나올거임.
		
		int arr3[] = arr1; // 이런식으로 초기화 해주면, arr3와 arr1은 같은 값을 참조하는, 같은 주솟값을 가지게 됨. 
		
		System.out.println("arr1 == arr3 :" + (arr1==arr3));
		
		arr3[0] = 4;
		
		// arr3와 arr1이 가지고있는 주솟값이 서로 같고, 참조하는 값도 같으므로, arr3가 참조하고 있는 값을 변경해주면, 자동으로 arr1이 참조하는 값도 변경되게 됨. 
		
		System.out.println("arr3[0] :" + arr3[0]);
		
		System.out.println("arr1[0] :" + arr3[0]);
		
		
		
		
		
		
		
	}

}

// 자바에서 자료형은 기본자료형과 참조자료형으로 나누어진다. 이떄, 참조자료형은, 배열이나 클래스, 이넡페이스가 이에 해당된다. (문자열도 포함 !)

// 참조 자료형이란, 값을 직접 갖고 있는 것이 아니라 값이 저장된 위치의 주소를 참조한느 변수이다. 즉, 주소를 가지고 있는 변수. 

// 첫번째 프로그램에서 name1과 name2는 같은 값을 가리키고 있기 때문에, 메모리의 값이 같음. C와 다르다. 

// 두번째 프로그램에서 name3와 name4가 가지고 있는 주솟값은 서로 다르기 때문에, false출력. 이전에 질문했던것과 같음 !



//출력 결과
/*
true
false
arr1 == arr2 :false
arr1 == arr3 :true
arr3[0] :4
arr1[0] :4

 */
