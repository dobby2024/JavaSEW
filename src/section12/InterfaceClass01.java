package section12;

import section12.access2.AttackMidfielder;
import section12.access2.Midfielder;
import section12.access2.Player;
import section12.access2.Team;

/*
 * 인터페이스(interface)
 *	추상메소들의 집합
 *	변수선언을 해도 변수가 아닌 상수가 된다.
 *	다중상속 가능
 *	
 *	객체 구조(뼈대)를 만들어 준다. 
 * 
 */
public class InterfaceClass01 {
	public static void main(String[] args) {
		System.out.println("---AttackMidfielder 객체---");
		AttackMidfielder am = new AttackMidfielder(); 
		am.printClubTeamInfo();
		am.dribble();
		am.makeGame();
		am.kick();
		
		
		System.out.println("---AttackMidfielder객체 Midfielder 타입으로 변환---");
		Midfielder mf = am;	// 다형성
		mf.printClubTeamInfo();
		mf.dribble();
		mf.makeGame();
		mf.kick();
		
		System.out.println("---AttackMidfielder객체 Player 타입으로 변환 ---");
		Player p = am;	// 다형성
		// p.printClubTeamInfo(); // Team 인터페이스에 선언되어있는 메소드 Player에 없음.
		p.dribble();
		// p.makeGame(); // Midfielder 인터페이스에 선언되어있는 메소드 Player에 없음.
		p.kick();
		
		System.out.println("---AttackMidfielder객체 Team 타입으로 변환 ---");
		Team t = am;	// 다형성
		t.printClubTeamInfo();
		// t.dribble();	// 호출 불가능	
		// t.makeGame(); // 호출 불가능
		// t.kick(); // 호출 불가능
		
	}

}








