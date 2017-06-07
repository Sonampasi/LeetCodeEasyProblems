import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
/*Leetcode solution

 */
	public int singleNumber(int[] nums) {
		int result = 0;
	    for (int i = 0; i<nums.length; i++)
	    {
			result ^=nums[i];
	    }
		return result;

/*My solution
		
		Map<Integer, Integer> map = new HashMap();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], 2);
			} else {
				map.put(nums[i], 1);
			}
		}

		Integer value = 1;
		int key = nums[0];
		for (Map.Entry entry : map.entrySet()) {
			if (value.equals(entry.getValue())) {
				key = (int) entry.getKey();
				return key;
			}
		}
		return key;  
 * 
 */
	}

	public static void main(String[] args) {
		SingleNumber sn = new SingleNumber();
		int[] nums = { -1,-1,-2,3,4,-2,3 };

		System.out.print(sn.singleNumber(nums));
	}
}
