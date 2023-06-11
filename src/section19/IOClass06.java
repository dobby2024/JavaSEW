package section19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * FileReader / FileWriter
 * 	문자단위로 파일을 읽기/쓰기 기능을 제공하는 클래스
 * 
 */
public class IOClass06 {
	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			// hello.txt 파일을 읽기 위한 FileReader 객체 생성
			fr = new FileReader("./upload/hello5.txt");
			// BufferedReader로 FileReader를 감싸서 버퍼기능 추가
			br = new BufferedReader(fr);
			
			// hello4.txt 파일을 쓰기위한 FileWrter 객체 생성
			fw = new FileWriter("./upload/hello4.txt");
			// BufferedWriter로 FileWriter를 감싸서 버퍼기능 추가
			bw = new BufferedWriter(fw);
			
			/*
			
			int readCharCnt = 0;
			char[] c = new char[4];
			
			int i = 0;
			while((readCharCnt = br.read(c)) != -1) {
				bw.write(c, 0, readCharCnt);
				System.out.println(i + ": " + new String(c, 0, readCharCnt));
				i++;
			}
			
			*/
			
			String line = "";
			int i = 0;
			while((line = br.readLine()) != null) {
				System.out.println(i+": " +line);
				i++;
			}
			
			System.out.println("실행 완료!");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(bw != null) bw.close();
			if(fw != null) fw.close();
			if(br != null) br.close();
			if(fr != null) fr.close();
		}
	}
}













