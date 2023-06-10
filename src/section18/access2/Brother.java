package section18.access2;

public class Brother extends Thread {
	public Wallet wallet;	// 지갑객체
	public int money;
	
	public Brother(Wallet wallet) {
		this.wallet = wallet;
	}
	
	
	@Override
	public void run() {
		while(true) {
			int returnedMoney = wallet.getMoney();
			if(returnedMoney == 0)
				break;
			
			money = money + returnedMoney;
			
			System.out.println("Brother 총 재산: " + money);
		}
	}

}









