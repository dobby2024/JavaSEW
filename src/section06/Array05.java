package section06;

public class Array05 {
	public static void main(String[] args) {
		// new 연산자를 사용하지 않고 2중 배열 선언
		int[][] nums = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12}
		};
		for(int i = 0; i < nums.length; i++) {
			// i = 0 -> nums[0] = {1,2,3} -> length:3
			
			for(int j = 0; j < nums[i].length; j++) {
				//i=0 -> nums[0][0] : 1 nums[0][1] : 2 nums[0][2] : 3   
				//i=1 -> nums[1][0] : 4 nums[1][1] : 5 nums[1][2] : 6   
				//i=2 -> nums[2][0] : 7 nums[2][1] : 8 nums[2][2] : 9   
				//i=3 -> nums[3][0] : 10 nums[3][1] : 11 nums[3][2] : 12   
				System.out.print(nums[i][j]+" ");
			}
			System.out.println(); 	// 개행
		}
	}
}





