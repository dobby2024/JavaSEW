package section19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * try-with-resources
 * 	try 코드 블록이 끝나면 자동으로 resouces를 종료해주는 기능이다.
 * 
 * AutoCloseable 상속받은 resouces만 가능!
 * 
 */
public class IOClass09 {
	public static void main(String[] args) {
		try(
				FileInputStream fis = new FileInputStream("./upload/hello.txt");
				BufferedInputStream bis = new BufferedInputStream(fis);
				
				FileOutputStream fos = new FileOutputStream("./upload2/hello6.txt");
				BufferedOutputStream bos = new BufferedOutputStream(fos);
		) {
			int readByteCnt = 0;
			byte[] b = new byte[1024];
			
			while((readByteCnt = bis.read(b)) != -1) {
				bos.write(b, 0, readByteCnt);
			}
			
			System.out.println("실행 완료!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}




