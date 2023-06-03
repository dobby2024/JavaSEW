package section15;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * Calendar 클래스
 * 	날짜 관련 객체
 * 	날짜 계산용으로 자주 사용
 * 	Date 객체와 호환 가능
 * 
 * 
 */
public class JavaUtilClass04 {
	
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance(); 
		
		int year = cal.get(Calendar.YEAR);
		System.out.println("올 해: " + year);
		
		int month = cal.get(Calendar.MONTH) + 1;
		System.out.println("월: " + month);
		
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println("일: " + day);
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		System.out.println(hour+":"+min+":"+sec);
		
		String strDate = getDateTime();
		System.out.println("strDate: " + strDate);
		
		
	}
	
	
	public static String getDateTime() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
		String strDate = sdf.format(date);
		
		// getDay() 요일 반환 0~6(일~토)
		int iDay = date.getDay();
		switch (iDay) {
		case 0: {strDate += " (일)";break;}
		case 1: {strDate += " (월)";break;}
		case 2: {strDate += " (화)";break;}
		case 3: {strDate += " (수)";break;}
		case 4: {strDate += " (목)";break;}
		case 5: {strDate += " (금)";break;}
		case 6: {strDate += " (토)";break;}
		}
		
		return strDate;
		
	}
	
	
	
}

































