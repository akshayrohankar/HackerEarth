package leetcode;

public class ReverseInteger {

public static int reverse(int x) {
	
	int reverse=0;
	
	while(x!=0) {
		reverse = reverse * 10 + x%10;
		x=x/10;
	}
	
	if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE)

		return 0;

		else

		return reverse;
	
        
    }
	
	public static void main(String[] args) {
		int[] input = {1,3,5,6};
		// TODO Auto-generated method stub
		//System.out.println(reverse(1534236469));
		System.out.println(searchInsert(input, 2));
	}
	
	
	
	 public static int searchInsert(int[] nums, int target) {
		 int i;
		 int pos=0;
		 for(i=0; i<nums.length-1;i++) {
			 
			 if(nums[i] == target) {
				 break;
			 }else if(target > nums[i])
			 continue;
		 }
		
		 return i;
	    }
	
	
	
	
	
	
	
	
	

}
