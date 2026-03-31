/**
 * 
 */
interface Dohyeong {
//	String COLOR = "black"; //public static : 상수(변경불가)
	void draw();
}
class 원 implements Dohyeong{
	 public void draw() {
		 System.out.println("원");
	 }
}
class 삼각형 implements Dohyeong{
	 public void draw() {
		 System.out.println("삼각형");
	 }
}
public class 예외처리5 {
	 public static void main(String[] args) {
		 Dohyeong test = new 원();
		 Dohyeong test1 = new 삼각형();
		 test.draw();
		 test1.draw();
	}
}