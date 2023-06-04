package section16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map
 * 	Key값, Value 값을 쌍으로 저장하는 객체. (사전형태)
 *  Key값은 중복 불가
 * 
 * 
 */
public class Collection05 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		// 데이터 저장하기
		map.put("Hello", "안녕하세요");
		map.put("Car", "자동차");
		map.put("Tiger", "호랑이");
		
		// 데이터 가져오기
		String value = map.get("Tiger");
		System.out.println("Tiger 뜻은 : "+ value);
		
		// Map에 있는 키값 불러오기
		Set<String> keys = map.keySet();
		
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) { 
			String key = it.next();
			System.out.println(key + ":" + map.get(key));
		}
		
	}

}









