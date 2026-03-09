



public class 변수3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte a = Byte.MIN_VALUE;
		byte b = Byte.MAX_VALUE;
		
		System.out.println("byte 범위 : " + a + "~" + b);
		
		long a2 = Long.MIN_VALUE;
		long b2 = Long.MAX_VALUE;
		
		System.out.println("Long 범위 : " + a2 + "~" + b2);
		
		short a3 = Short.MIN_VALUE;
		short b3 = Short.MAX_VALUE;
		
		System.out.println("short 범위 : " + a3 + "~" + b3);
		
		/*
		 * 	실수
		 * 		double => default 8byte
		 * 		float => 4byte
		 */
		
		double d = 10.5f;
//		float f = 10.5;
		float f = (float)10.5;  // => 형변환

	}

}
