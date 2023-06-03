package section15;
/*
 * Date 클래스
 * 	현재 날짜와 시간을 가진 Date 객체
 * 	날짜 관련 객체
 * 
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtilClass03 {
	public static void main(String[] args) throws ParseException {
		// 날짜 객체 생성
		Date date = new Date();
		
		System.out.println(date);
		
		// 날짜 포맷 변경해주는 객체
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String strDate = sdf.format(date);
		
		System.out.println("strDate: " + strDate);
		
		String yesterday = "2023.06.02 16:28:00";
		
		Date yDate = sdf.parse(yesterday);
		System.out.println("yDate: " + yDate);
		
		
		
	}
}
















