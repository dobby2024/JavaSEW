package section08;

public class VoTest {
	public static void main(String[] args) {
		OrderVO orderVO = new OrderVO();
		
		// 값 입력하는 set메소드
		orderVO.setOrderNo(1);
		
		// 값 불러오는 get메소드 
		System.out.println(orderVO.getOrderNo());
		
	}
}
