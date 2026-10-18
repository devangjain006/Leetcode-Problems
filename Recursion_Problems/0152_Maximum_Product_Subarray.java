class Solution {
    public int maxProduct(int[] nums) {
        int j = nums.length-1;
        int leftsum =1;
        int rightsum = 1;
        int res = Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++)
       {
            leftsum*=nums[i];
            rightsum*=nums[j];
            res = Math.max(res, Math.max(leftsum, rightsum));
            if(leftsum==0)leftsum=1;
            if(rightsum==0)rightsum=1;
            j--;
       }
       return res;

    }
}
