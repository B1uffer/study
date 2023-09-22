package ch2;

public class OverflowEx {

	public static void main(String[] args) {
		
		short sMin = -32768;
		short sMax = 32767;
		char cMin = 0;
		char cMax = 65535;
		
		System.out.println("sMin = " + sMin);		// -32768		
		System.out.println("sMin-1 = " + (short) (sMin-1));		//32767 원래는 -32768에서 -1을 더해주면 -32769 이지만 sMin과 sMax로 범위를 지정했기 때문에 overflow가 되어서 32767 최대값으로 되돌아감
		System.out.println("sMax = " + sMax);
		System.out.println("sMax + 1 = "  + (short) (sMax+1));		// 숫자형은 한번 계산할때 int형으로 한번 변환했다가 돌아오기 때문에 (short)로 형변환을 해서 overflow가 되는지의 여부를 알아봄
		System.out.println("cMin = " + (int)cMin);
		System.out.println("cMin-1 = " + (int)--cMin);
		System.out.println("cMax = " + (int) cMax);
		System.out.println("cMax + 1 = " + (int) ++cMax);
		
		
		System.out.println('\n');
		
		// 
		
		int num = 10;
		System.out.println(--num);
		System.out.println(++num);
		System.out.println(num--);
		System.out.println(num++);
		System.out.println(num);
		
		System.out.println('\n');
		
		System.out.println(10 << 2);		// CRC check sum 연산		00001010에서 왼쪽으로 두 칸 이동함, 00101000이 되는것.
		System.out.println(10 >> 3);		// shift가 어디로 되는지만 이해하자	00001010에서 오른쪽으로 세 칸 이동함, 00000001이 되는것.
		
	}

}
