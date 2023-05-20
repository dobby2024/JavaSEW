package section12.access2;

public class Defender implements Player, Team {

	public String name;
	
	public Defender() {
		this.name = "김민재";
	}
	
	@Override
	public void pass() {
		System.out.println("안전하고 정확합니다.");
	}

	@Override
	public void kick() {
		System.out.println("적당히 좋다.");
	}

	@Override
	public void shot() {
		System.out.println("글쎄요..");
	}

	@Override
	public void dribble() {
		System.out.println("빠르고 공간침투를 잘합니다.");
	}

	@Override
	public void printClubTeamInfo() {
		System.out.println("나폴리");
	}

	@Override
	public void printNationalTeamInfo() {
		System.out.println("대한민국");
	}
}





