package section19;

import java.io.File;
import java.io.IOException;

/*
 * 경로(path) - 파일이나 디렉토리 위치를 나타내는 문자열
 * 1. 절대경로
 * 		파일 시스템의 루트 디렉토리부터 출발하여 파일이나 디렉토리 찾는 경로
 * 		
 * 		ex) C:\java_th\workspace\JavaSEW\src\section19\IOClass02.java	
 * 		
 * 		OS별 루트 경로
 * 			win - C:\
 * 			리눅스/mac - /
 * 	
 * 2. 상대경로
 * 		현재 작업 디렉토리를 기준으로 파일이나 디렉토리를 찾는 경로
 * 			
 * 		ex) . -> 현재 위치
 * 			.. -> 상위 폴더
 * 
 * 			./JAVA_GitHub연동.pptx
 * 			
 */

public class IOClass02 {
	public static void main(String[] args) throws IOException {

		File f1 = new File("./", "java.txt");
		
		// createNewFile() - 파일 생성하면 true, 못하면 false
		if(f1.createNewFile()) {
			System.out.println("java.txt 파일이 생성되었습니다.");
		}
		
		// delete() - 파일 삭제하면 true 못하면 false
		if(f1.delete()) {
			System.out.println("java.txt 파일이 삭제되었습니다.");
		}
		
	}
}







