package 예외처리;

public class ex21_사용자정의예외 {

	public static void main(String[] args) {
		
		try {
			
			startInstall();
			copyFiles();
			
		} catch(SpaceException se) {
			
			System.out.println("에러 : " + se.getMessage());
			se.printStackTrace();
			System.out.println("공간을 확보한 뒤 다시 설치해주시길 바랍니다");
			
		} catch(MemoryException me) {
			
			System.out.println("에러 : " + me.getMessage());
			me.printStackTrace();
			
			System.gc(); 			// Garbage Collection을 수행하여 메모리를 늘려주는 코드임
			
			System.out.println("메모리를 확보한 후 다시 설치해주시길 바랍니다");
			
		} finally {
			
			deleteTempFiles();
			
		}

	}

	
	// 이 밑은 인스턴스 메서드들
	
	static void startInstall() throws SpaceException, MemoryException {
		// 인스톨을 시작하는 코드
		if(!enoughSpace()) {		// !enoughSpace이므로 true, 설치 공간이 없다면 즉 false는 설치할 공간이 있다는 의미
			
			throw new SpaceException("설치할 공간이 부족합니다");
			
		}
		
		if(!enoughMemory()) {
			
			throw new MemoryException("메모리가 부족합니다");
		}
		
	}
	
	static void copyFiles() {
		// 파일을 복사하는 코드
		
		
	}
	
	static void deleteTempFiles() {
		// 임시파일들을 삭제하는 코드
		
		
	}
	
	static boolean enoughSpace() {
		// 설치하는 데 필요한 공간이 있는지 확인하는 코드
		return false;
		
	}
	
	static boolean enoughMemory() {
		
		return false;
		
	}
}
