class Solution {
    public boolean increasingTriplet(int[] nums) {

        int n = Integer.MAX_VALUE;
        int cs;
        int s;

        int len = nums.length;

        cs = nums[0];
        s = nums[0];

        for (int i = 1; i < len; i++) {

            System.out.println(n + " " + cs + " " + s);

            if (nums[i] > n) {

                return true;

            }else if(n==Integer.MAX_VALUE && nums[i] < cs){
                cs=nums[i];
                s=nums[i];

            } else if (nums[i] < n && nums[i] > cs) {
                n = nums[i];

            } else if (nums[i] > s) {

                n = nums[i];
                cs = s;

            } else if (nums[i] < s) {
                s = nums[i];

            }

        }

        return false;
    }
}