import java.io.File;
import java.io.FileReader;
import java.util.Scanner;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.w3c.dom.Element;

public class 제어문_반복문_while {
	public static void main(String[] args) throws Exception{
//		File file = new File("C:\\javaDev\\moive.txt");
//		FileReader fr = new FileReader(file);
//		StringBuffer db = new StringBuffer();
//		int i=0;
//		while((i=fr.read())!=-1) {
//			db.append((char)i);
//		}
//		fr.close();
//		System.out.println(db.toString());
		
		for(char c='A';c<='Z';c++) {
			System.out.print(c);
		}
		System.out.println();
		char c = 'A';
//		while(c<='Z') {
//			System.out.print(c);
//			c++;
//		}
//		System.out.println();
//		do {
//			System.out.print(c);
//			c++;
//		}while(c<='Z');
//		Scanner scan = new Scanner(System.in);
//		int user = scan.nextInt();
//		int i = 1;
//		while(i<=9) {
//			System.out.printf("%d * %d = %d\n",user,i,user*i);
//			i++;
//		}
		
//		int i =1;
//		int sum = 0;
//		int even = 0;
//		int odd = 0;
//		while(i<=100) {
//			sum += i;
//			if(i%2==0) {
//				even+=i;
//			} else odd+=i;
//			i++;
//		}
//		System.out.println(sum);
//		System.out.println(even);
//		System.out.println(odd);
		Scanner scan = new Scanner(System.in);

		System.out.println("지니뮤직");
		while(true) {
			System.out.println("===메뉴====");
			System.out.println("1.가요");
			System.out.println("2.가요");
			System.out.println("3.가요");
			System.out.println("4.가요");
			System.out.println("5.종료");
			System.out.println("=====");
			System.out.println("메뉴선택 : ");
			
			int user = scan.nextInt();
			String url = "https://www.genie.co.kr/chart/genre?ditc=D&ymd=20260309&genrecode=";
			String jl = " ";
			if(user<1 || user>5) {
				System.out.println("없는 메뉴 다시입력바람");
				continue;
			} else if(user == 1) {
				jl = "M0100";
				Document doc = 
						Jsoup.connect(url+jl).get();
				Elements title = doc.select(".title");
				for(int i=0;i<title.size();i++)
        		{
        			String s=title.get(i).text();
        			System.out.println((i+1)+"."+s);
        		}
				break;
        	} else if(user == 2) {
        		Document doc = Jsoup.connect("https://www.genie.co.kr/chart/genre?ditc=D&ymd=20260309&genrecode=M0200").get();
        		Elements title = doc.select(".title");
        		for(int i =0;i<title.size();i++) {
        			String s = title.get(i).text();
        			System.out.println((i+1)+"."+s);
        		}
        		break;
        	} 
		}
	}
}
