package section19;

/*
 * BufferedInputStream / BufferedOutputStream
 * 	자바에서 성능을 향상시켜주기 위한 I/O 보조 스트림
 * 
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;


public class IOClass05 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		
		PrintStream ps = null;
		
		
		try {
			// hello.txt 파일을 읽기 위한 객체생성
			fis = new FileInputStream("./upload/hello.txt");
			// 기존 스트림을 감싸서 버퍼에 저장
			bis = new BufferedInputStream(fis);
			
			// hello3.txt 파일을 쓰기 위한 객체생성
			fos = new FileOutputStream("./upload2/hello3.txt");
			// 기존 스트림을 감싸서 버퍼에 저장
			bos = new BufferedOutputStream(fos);
			
			ps = new PrintStream(bos, true);
			
			int readByteCnt = 0;
			byte[] b = new byte[1024];
			
			while((readByteCnt = bis.read(b)) != -1) {
				bos.write(b, 0, readByteCnt);
			}
			
			bos.flush();	// 버퍼에 남은 데이터를 파일에 쓰고 버퍼를 비움 
			
			ps.println();
			ps.println("=========================");
			ps.println("안녕하세요.");
			ps.println("PrintStream으로 작성했어요!");
			ps.println("=========================");
			
			System.out.println("실행 완료!");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(ps != null) ps.close();
			if(bos != null) bos.close();
			if(fos != null) fos.close();
			if(bis != null) bis.close();
			if(fis != null) fis.close();
		}
				
		
	}
}










