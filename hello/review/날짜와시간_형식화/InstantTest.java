package 날짜와시간_형식화;

import java.time.*;

public class InstantTest {

	public static void main(String[] args) {
		
		//Instant는 에포크 타임으로부터 경과된 시간을 나노초 단위로 표현함
		// 에포크 타임(EpochTime)이란 1970-01-01
		
		Instant now = Instant.now();
		Instant now2 = Instant.ofEpochSecond(now.getEpochSecond());
		Instant now3 = Instant.ofEpochSecond(now.getEpochSecond());
		Instant now4 = Instant.ofEpochSecond(now.getEpochSecond(), now.getNano());
		Instant now5 = Instant.ofEpochSecond(now.getEpochSecond(), now.getNano());
		
		System.out.println(now);
		System.out.println(now3);
		System.out.println(now5);
		System.out.println();
		
		long epochSec = now.getEpochSecond();
		int nano = now.getNano();
		
		System.out.println(epochSec);
		System.out.println(nano);
		
	}

}
