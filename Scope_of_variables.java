
public class Scope_of_variables {
	
	int no; // class안에서 사용할 수 있는 변수
	
	public static void main(String[]args)
	{
		
		String name; // main 안에서 사용 가능한 변수
		
		if(true)
		{
			name = "구교민";
			
			String email = "bluesky030@naver.com"; // if문 안에서 사용 가능한 변수 
			
			System.out.println(name + ":" + email); 
			
			
		}
		
		// email = "bluesky030@naver.com"; email이라는 변수는 if문 밖에서 사용할 수 없음. 
	}

}

//출력 결과
/*
구교민:bluesky030@naver.com
*/

