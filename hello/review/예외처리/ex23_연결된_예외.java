package 예외처리;

public class ex23_연결된_예외 {

	public static void main(String[] args) {
		
		// InstallException2, SpaceException2, MemoryException2 참조
		
		try {
			
			install();
			
				
		} catch(InstallException2 ie) {
			
			ie.printStackTrace();
			
		} catch(MemoryException2 me) {
			
			me.printStackTrace();
			
		}
		
		
	
	}
	
	
	static void install() throws InstallException2, MemoryException2 {
		
		try {
			
			startInstall();
			copyFiles();
			
			
		} catch(SpaceException2 se) {
			
			InstallException2 ie = new InstallException2("설치 중 예외가 발생했습니다.");
			
			ie.initCause(se);		// ie.initCause()로 se, SpaceException2를 원인예외로 등록한다
			// ie.initCause();에서 ie가 붙은 이유는 ie와 연결된 InstallException2의 조상이 Exception이기 때문
			
			throw ie;	// InstallException2으로 예외를 넘긴다
			
			
		} catch(MemoryException2 me) {
			
			MemoryException2 ie = new MemoryException2("설치 중 예외가 발생했습니다2.");
			
			ie.initCause(me);
			throw ie;
			
		} finally {
			
			deleteTempFiles();
			
		}
		
	}

	static void startInstall() throws SpaceException2, MemoryException2 {
		
		if(!enoughSpace()) {		// !enoughSpace() = true
			
			throw new SpaceException2("설치할 공간이 부족합니다.");
			
		}
		
		if(!enoughMemory()) {		// !enoughMemory() = true
			
			throw new MemoryException2("설치에 필요한 메모리가 부족합니다.");
			
			// throw new RuntimeException(new MemoryException2("설치에 필요한 메모리가 부족합니다."));
		}
		
	}
	
	static boolean enoughSpace() {
		
		// 설치에 필요한 공간이 있는지 확인하는 코드를 작성한다.
		
		return false;		// false 상태라는건 공간이 충분하다는 의미
		
	}
	
	
	static boolean enoughMemory() {
		
		// 설치에 필요한 메모리공간이 있는지 확인하는 코드를 작성한다.
		
		return false;		// false 상태라는건 메모리가 충분하다는 의미
		
	}
	
	static void copyFiles() {
		
		// 파일 복사에 필요한 코드
		
	}
	
	static void deleteTempFiles() {
		
		// 설치에 쓰인 임시파일들을 삭제하는 코드
		
	}
	
}
