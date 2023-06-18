package section21.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class EchoClient {
	public static void main(String[] args) throws IOException {
		Socket socket = null;
		OutputStream out = null;
		InputStream in = null;
				
		try {
			// 서버 3000번 port로 접속 시도한다.
//			socket = new Socket("192.168.1.101", 3000);
			socket = new Socket("localhost", 3000);
			
			// Socket을 이용하여 바이트 출력 스트림 객체 생성
			out = socket.getOutputStream();
			
			// getBytes() 메소드는 문자열 byte[]로 바꿔준다.
			out.write("Hello Socket!".getBytes());
			
			// Socket을 이용하여 바이트 입력 스트림 객체 생성
			in = socket.getInputStream();
			byte[] b = new byte[1024];
			
			// 서버에서 보내온 데이터를 읽어서 b(버퍼)에 저장
			int readByteCnt = in.read(b);
			
			System.out.println(new String(b, 0, readByteCnt));
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(in != null)in.close();
			if(out != null)out.close();
			if(socket != null)socket.close();
		}
		
	}
}



