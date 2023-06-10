package section18.access2;

public class Sister extends Thread {
	public Wallet wallet;	// 지갑객체
	public int money;
	
	public Sister(Wallet wallet) {
		this.wallet = wallet;
	}
	
	@Override
	public void run() {
		while(true) {
			int returnedMoney = wallet.getMoney();
			if(returnedMoney == 0)
				break;
			
			money = money + returnedMoney;
			
			System.out.println("Sister 총 재산: " + money);
		}
	}
}




