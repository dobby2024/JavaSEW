package section05;
/*

*
**
***
****
*****
******
*******

반복문 조건문 연습
 주말숙제 2중for문 코드 분석하기 
 
2번
   *
  **
 ***
****

3번
   *
  ***
 *****
******* 
  
4번

			i 		j
   *		0		
  ***		1		  
 *****		2		
*******		3
 *****		4	+	6 = 10 > 9 
  ***		5	+	5, 6 = 10 > 9 
   *		6	+	4, 5, 6 = 10 > 9

   ☆
   *
  ***
 *****
******* 
  | | Merry Christmas~*

 
 */

public class LoopHomeWork {
	public static void main(String[] args) {

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {

				if (i < 7 / 2 + 1) {
					if (i + j < 3) {
						System.out.print(" ");
					} else if (j - i > 3) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else {
					if (i - j > 3) {
						System.out.print(" ");
					} else if (i + j > 9) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}
			}
			System.out.println(); // 개행
		}

	}
}
