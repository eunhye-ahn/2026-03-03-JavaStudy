import java.awt.Image;
import java.net.URL;

public abstract class CommonMusic{
	public static Music[] musics = new Music[50];
	//데이터 수집
	public abstract void Init();
	//목록 출력
	public Music[] MusicList() {
		return musics;
	}
	//상세보기
	public void print() {
		for(int i =0; i<musics.length;i++) {
			System.out.println(musics[i].getMno()+". "+musics[i].getTitle());
			System.out.println(musics[i].getSinger());
			System.out.println(musics[i].getAlbum());
		}
	}
	
	//검색
	
	//동영상
}

/**
 * url / network / database => 관련 에러는 예외처리 필수 - checkexception
 * 그 외 에러들은
 * uncheckexception - 개발자 실수 or 사용자가 원하지않은 값 입력
 * ex) id중복 확인, 몇글자확인 => 넘어가지않도록 trycatch?? => 비정상적종료안하고 정상적으로 종료??
*/