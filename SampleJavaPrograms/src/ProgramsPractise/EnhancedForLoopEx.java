package ProgramsPractise;

public class EnhancedForLoopEx {

	public static void main(String[] args) {
		// Jagged arrays i.e column size for each row is defined separately
		int[][] nums = new int[3][];
		nums[0] = new int[3];
		nums[1] = new int[4];
		nums[2] = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
			
				nums[i][j] = (int) (Math.random() * 10);
			System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
		//enhanced for loop
		for(int n[]:nums) {
			for(int m: n) {
			System.out.print(m +" ");
			}
			System.out.println();
		}

	}

}
