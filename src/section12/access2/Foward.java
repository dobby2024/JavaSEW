package section12.access2;

public class Foward implements Player, Team{
	
	public String name;
	
	public Foward() {
		this.name = "홀란드";
	}
	
	@Override
	public void pass() {
		System.out.println("적당히 잘해요.");
	}

	@Override
	public void kick() {
		System.out.println("적당히 잘해요.");
	}

	@Override
	public void shot() {
		System.out.println("강력하고 정확해요.");
	}

	@Override
	public void dribble() {
		System.out.println("파워풀하고 빨라요.");
	}

	@Override
	public void printClubTeamInfo() {
		System.out.println("맨체스터 시티");
	}

	@Override
	public void printNationalTeamInfo() {
		System.out.println("노르웨이 국가대표");
	}
}
