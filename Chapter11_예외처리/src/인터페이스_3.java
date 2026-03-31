interface AA{
	void display();
}
interface BB{
	void edit();
}
class CC implements AA,BB{
	public void display() {
		System.out.println(1);
	}
	public void edit() {
		System.out.println(2);
	}
}
public class 인터페이스_3 {
	public static void main(String[] args) {
		CC test = new CC();
		test.display();
		test.edit();
	}	
}
