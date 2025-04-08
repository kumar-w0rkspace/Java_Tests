package day005_b_Jump_Control_Statements;

public class Xeg_AB_Continue {

	public static void main(String[] args) {
		// Print one to ten and skip 3, 5, 9
		
		for (int i = 1; i <= 10; i ++) {
			
			if(i == 3 || i == 5 || i == 9) {
				continue;
			}
			
			System.out.println(i);
			
		}

	}

}
