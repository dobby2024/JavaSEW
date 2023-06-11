package section19;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import section19.access1.Member;

public class IOClass08 {
	public static void main(String[] args) throws IOException {
		String filePath = "./upload/member.obj";
		
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream(filePath));
			
			Member member = (Member) ois.readObject();
			System.out.println("백업파일 >> 객체화");
			System.out.println("이름: " + member.getName());
			System.out.println("나이: " + member.getAge());
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(ois != null)ois.close();
		}
	}

}
