package section16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
  			
  	no:1	name:blue	mobile:010-1111-1111
  	no:2	name:green	mobile:010-1111-2222
  	no:3	name:red	mobile:010-1111-3333
  	no:4	name:orange	mobile:010-1111-4444
 */


public class Collection06 {
	public static void main(String[] args) {
		List<Map<String, Object>> list = new ArrayList<>();
		Map<String, Object> map1 = new HashMap<>();
		Map<String, Object> map2 = new HashMap<>();
		Map<String, Object> map3 = new HashMap<>();
		Map<String, Object> map4 = new HashMap<>();
		
		map1.put("no", 1);
		map1.put("name", "blue");
		map1.put("mobile", "010-1111-1111");
		
		list.add(map1);
		
		
		map2.put("no", 2);
		map2.put("name", "green");
		map2.put("mobile", "010-1111-2222");
		
		list.add(map2);
		
		map3.put("no", 3);
		map3.put("name", "red");
		map3.put("mobile", "010-1111-3333");
		
		list.add(map3);
		
		
		map4.put("no", 4);
		map4.put("name", "orange");
		map4.put("mobile", "010-1111-4444");
		
		list.add(map4);
		
		
		System.out.println("no\tname\tmobile");
		for(Map<String, Object> row : list) {
			Integer no = (Integer) row.get("no");
			String name = (String) row.get("name");
			String mobile = (String) row.get("mobile");
			
			System.out.println(no+"\t"+name+"\t"+mobile);
		}
		
		
		List<MemberVO> memberList = new ArrayList();
		MemberVO member1 = new MemberVO();
		MemberVO member2 = new MemberVO();
		MemberVO member3 = new MemberVO();
		MemberVO member4 = new MemberVO();
		
		member1.setNo(1);
		member1.setName("blue");
		member1.setMobile("010-1111-1111");
		
		memberList.add(member1);
		
		
		member2.setNo(2);
		member2.setName("green");
		member2.setMobile("010-2222-2222");
		
		memberList.add(member2);
		
		member3.setNo(3);
		member3.setName("red");
		member3.setMobile("010-3333-3333");
		
		memberList.add(member3);
		
		member4.setNo(4);
		member4.setName("orange");
		member4.setMobile("010-4444-4444");
		
		memberList.add(member4);
		
		System.out.println("====================================");
		
		System.out.println("no\tname\tmobile");
		for(MemberVO member : memberList) {
			Integer no = member.getNo();
			String name = member.getName();
			String mobile = member.getMobile();
			
			System.out.println(no+"\t"+name+"\t"+mobile);
		}
	}
}



class MemberVO {
	private Integer no;
	private String name;
	private String mobile;
	public Integer getNo() {
		return no;
	}
	public void setNo(Integer no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
}















