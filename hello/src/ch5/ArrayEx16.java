package ch5;						// 커맨드 라인을 통해 입력받기

public class ArrayEx16 {

	public static void main(String[] args) {
		
		System.out.println("매개변수의 개수 : " + args.length);
		
		for(int i=0; i < args.length; i++)	{
			
			System.out.println("args[" + i + "] = \"" + args[i] + "\"");
			
		}
			/** 커맨드 라인 설정하는 법
			 * 
				cmd 입력 -> eclipse ArrayEx16에 해당하는 주소로 이동(cd 파일주소) -> 
				java ArrayEx16 입력할변수 입력 -> 매개변수의 개수가 cmd에 출력된다
				
				**/
		
	}

}
