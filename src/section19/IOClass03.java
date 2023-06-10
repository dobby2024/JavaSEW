package section19;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

public class IOClass03 {
	public static void main(String[] args) throws IOException {
		Calendar c = Calendar.getInstance();
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		int millisec = c.get(Calendar.MILLISECOND);
		
		File f1 = new File("./upload/"+year+"/"+month+"/"+day);
		
		// mkdirs() - 디렉토리 생성
		if(f1.mkdirs()) {
			System.out.println(f1.getPath()+" 디렉토리가 생성되었습니다.");
		}
		
		String uploadFile = "upload_"+year+month+day+millisec;
		File f2 = new File(f1, uploadFile);
		if(f2.createNewFile()) {
			System.out.println(uploadFile + "이 생성되었습니다.");
		}
		
	}
}



