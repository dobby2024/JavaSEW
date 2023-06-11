package section19;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import section19.access1.Member;

/*
 * ObjectInputStream / ObjectOutputStream
 * 	객체를 바이트 스트림으로 읽고 쓰는 클래스
 * 
 * Serializable
 * 	직렬화, 객체를 일련의 바이트(byte)로 변환하는것을 말한다.
 *
 */
public class IOClass07 {
	
	public static void main(String[] args) throws IOException {
		
		Member member = new Member();
		member.setName("홍길동");
		member.setAge(18);
		
		String filePath = "./upload/member.obj";
		
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream(filePath));
			oos.writeObject(member);
			System.out.println("객체 >> 파일백업");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(oos != null) oos.close();
		}
			
	}

}







