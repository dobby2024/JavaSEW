package section10;

public class ExtendsClass02 {
	public static void main(String[] args) {
		
		SmartTV smartTV = new SmartTV();
		smartTV.brand = "LG";
		smartTV.cpu = "Snapdragon";
		smartTV.ram = 8;
		smartTV.hdd = 256;
		smartTV.gpu = "기본";
		smartTV.bluetooth = "기본";
		smartTV.mike = "기본";
		smartTV.camera ="소니";
		smartTV.gps = null;
		smartTV.telcom ="SK 가족결합인터넷 TV";
		
		
		SmartTV smartTV2 = new SmartTV("삼성");	
	}
}









