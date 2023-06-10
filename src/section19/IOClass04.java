package section19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * InputStream / OutputStream
 * 	바이트 기반 입력과 출력을 다루는 추상 클래스이다.
 * 
 * FileInputStream
 * 	파일을 바이트 단위로 순차적으로 읽는 객체
 * 
 * FileOutputStream
 * 	파일을 바이트 단위로 순차적으로 쓰는 객체
 */

public class IOClass04 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			// hello.txt 파일을 읽기 위한 객체
			fis = new FileInputStream("./upload/hello.txt");
			
			File f1 = new File("./upload2");
			if(f1.mkdir()) {
				System.out.println("upload2 디렉토리가 생성되었습니다.");
			}
			
			File f2 = new File(f1, "hello2.txt");
			if(f2.createNewFile()) {
				System.out.println("hello2.txt 파일이 생성되었습니다.");
			}
			
			/*
			 * hello2.txt 에 쓰기위한 객체 생성
			 * FileOutputStream 경로에 디렉토리는 존재해야 한다. 없으면 에러
			 * 파일이 없으면 자동으로 생성된다.
			 */
			
			fos = new FileOutputStream(f2);
			
			int readByteCnt = 0;
			byte[] b = new byte[100];
			
			while((readByteCnt = fis.read(b)) != -1) {
				fos.write(b, 0, readByteCnt);
			}
			
			System.out.println("실행완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(fos != null) fos.close();
			if(fis != null) fis.close();
		}
		
	}

}






