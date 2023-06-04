package section16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Set
 * 	순서가 없는 데이터 집합
 * 	중복을 허용하지 않는다.
 * 
 * 반복자(Iterator)
 * 	자바 컬렉션 프레임웍에서 컬렉션에 저장된 요소를 읽어오는데 사용되는 인터페이스.
 * 
 * 
 */
public class Collection04 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		// 데이터 저장
		set.add("피카츄");
		set.add("라이츄");
		set.add("파이리");
		
		// 중보값 허용 안함!
		set.add("잉어킹");
		set.add("잉어킹");
		set.add("잉어킹");
		set.add("잉어킹");
		set.add("잉어킹");
		
		// 데이터 개수
		System.out.println("데이터 개수: " + set.size());
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {	// hasNext() 다음요소가 있는지 확인해서 boolean 반환
			String name = it.next();	// 해당요소를 반환한다.
			System.out.println("name: " + name);
		}
	}

}









