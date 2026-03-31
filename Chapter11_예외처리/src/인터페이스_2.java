import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

interface Post {
	void write();
	void delete();
	void update();
}
class PostImpl implements Post{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("글작성");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("삭제");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("수정");
	}
	
}
/**
 * 인터페이스를 쓰는 이유
 * 1.한 클래스로 제어하면 한번만 호출할 수 있음
 * 2.비슷한 기능끼리 묶을 수 있음
 */
public class 인터페이스_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("메뉴선택 : ");
		int menu = scan.nextInt();
		Post a = new PostImpl();
		if(menu == 1) {
			a.write();
		} else if(menu == 2) {
			a.delete();
		} else if(menu == 3) {
			a.update();
		} 
		//map으로 데이터를 모아주고 관리 : 콜렉션*** 보충공부필요
		//보통 데이터를 읽어와서 List로 묶어줄때도 map을 씀
	}
}
