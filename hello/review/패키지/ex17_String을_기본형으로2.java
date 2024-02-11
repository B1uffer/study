package 패키지;

public class ex17_String을_기본형으로2 {

	public static void main(String[] args) {
		
		String fullName = "Hello,java";
		
		int index = fullName.indexOf(',');		// fullName 인스턴스에서 ,의 위치를 찾는 indexOf()
		
		System.out.println(fullName);
		System.out.println(index);
		System.out.println();
		
		String fileName = fullName.substring(0, index);		
		// fullName의 첫글자부터 ,이 있는 곳까지 문자열을 추출하는 subString();
		System.out.println(fileName);
		
		String ext = fullName.substring(index+1);		// index = fullName.indexOf(',');값이 5니까 +1 하면 6
		// fullName.substring(index+1, fullName.length()); 와 같음 즉 fullName.substring(6,9);
		// fullName.length()니까 마지막까지
		System.out.println(ext);
		
		System.out.println(fullName + "의 쉼표 뒷글자를 제외한 이름은 " + fileName);
		System.out.println(fullName + "의 쉼표 뒷글자 이름은 " + ext);
		
	}

}

		// substring(int start, int end)를 사용할 때 주의할 점
		// 매개변수로 사용되는 문자열에서 각 문자의 위치를 뜻하는 index가 0부터 시작한다는 것.
		// start부터 end의 범위 중, end위치에 있는 문자는 결과에 포함되지 않는다는 점.
		// end에서 start의 값을 빼면 (end - start) substring에 의해 추출될 글자의 수가 됨
		// substring의 철자에 주의! subString이 아님
