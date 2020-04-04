package REPLHW;

public class Repl135 {
	 static int maxValue(int[] nums) {

		int largest = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > largest) {
				largest = nums[i];
			
			}

			

		}
		return largest;
	}
}
