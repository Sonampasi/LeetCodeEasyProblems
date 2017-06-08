/*
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Time complexity: O(n)
 */
public class MoveZeros {
	
	
	public void moveZeroes(int[] nums){
  	  int index = 0;
  	  
  	  for(int num : nums){
  		  if(num!=0)
  		  nums[index++] = num;
  	  }
  	  
  	  while(index!=nums.length){
  		  nums[index++]=0;
  	  }
	  
  	  int k = 0;
	  while(k!=nums.length){
			System.out.print(nums[k]+" ");
			k++;
	  }
    }

		
	public static void main(String[] args) {
		MoveZeros obj = new MoveZeros();
		int[] nums = {0,1,0,3,12};
		obj.moveZeroes(nums);
	}

}
