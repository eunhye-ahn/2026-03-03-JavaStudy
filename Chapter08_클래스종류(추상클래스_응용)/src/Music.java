

// VO(데이터보호) / DTO(모아서전송) / Entity()

import lombok.Getter;
import lombok.Setter;
//데이터 클래스
//사용자 정의 데이터형 => 메모리크기 자동할당
@Setter
@Getter
class Music{
	private int mno;
	private String poster;
	private String title;
	private String singer;
	private String album;
	private String state;
	private int idcrmnent; //?
}
