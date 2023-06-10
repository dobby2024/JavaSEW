package section19;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 * I/O (Input/Output)
 * 	데이터를 읽고 쓰는 작업을 의미한다.
 *  자바에서 java.io 패키지를 통해 작업할수 있다.
 *  
 * File Class
 * 	경로 정보를 받아 파일 또는 디렉토리 정보를 객체화
 * 
 */
public class IOClass01 {
	public static void main(String[] args) {
		// File 객체 생성
		File f = new File("C:\\");
		
		// C 드라이브 하위에 있는 모든 디렉토리 및 파일 반환
		String[] list = f.list();
		
		// Calendar 객체 생성
		Calendar c = Calendar.getInstance();
		
		for(String temp : list) {	// 파일 목록 반복문 이용 하나씩 가져오기
			// temp 명의 디렉토리 또는 파일을 File 객체로 생성
			File f2 = new File(f, temp);
			
			// 1970년 1월 1일부터 현재 수정한 날짜를 밀리세컨드로 반환한다.
			long lastMod = f2.lastModified();
			
			// 현재 파일 또는 디렉토리의 마지막 수정한 날짜를 Calendar 객체로 다시 설정
			c.setTimeInMillis(lastMod);
			
			// 마지막 수정한 날짜 포맷변환하여 문자열로 반환
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
			String day1 = sdf.format(c.getTime());
			
			// isDirectory() - 디렉토리이면 true, 파일이면 false
			if(f2.isDirectory()) { 
				System.out.print(f2.getName()+"(디렉토리) - ");
				System.out.println(day1);
			}
		}
		
		
		for(String temp : list) {	// 파일 목록 반복문 이용 하나씩 가져오기
			// temp 명의 디렉토리 또는 파일을 File 객체로 생성
			File f2 = new File(f, temp);
			
			// 1970년 1월 1일부터 현재 수정한 날짜를 밀리세컨드로 반환한다.
			long lastMod = f2.lastModified();
			
			// 현재 파일 또는 디렉토리의 마지막 수정한 날짜를 Calendar 객체로 다시 설정
			c.setTimeInMillis(lastMod);
			
			// 마지막 수정한 날짜 포맷변환하여 문자열로 반환
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
			String day1 = sdf.format(c.getTime());
			
			// isFile() - 파일이면 true, 디렉토리이면 false
			if(f2.isFile()) { 
				String size = String.format("%,d", f2.length());
				System.out.print(f2.getName()+"(파일) - ");
				System.out.print(size + "byte - ");
				System.out.println(day1);
			}
		}
	}
}










