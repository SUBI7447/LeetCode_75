// Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

// You must write an algorithm that runs in O(n) time and without using the division operation.


class Solution {
    public int[] productExceptSelf(int[] nums) {

        int len = nums.length;

        int pre[] = new int[len];
        int suf[] = new int[len];
        int ans[] = new int[len];

        pre[0] = nums[0];
        suf[len - 1] = nums[len - 1];

        if (len == 2) {

            int temp=nums[0];
            nums[0]=nums[1];
            nums[1]=temp;

            return nums;
        }
        

        for (int i = 1; i < len - 1; i++) {

            pre[i] = nums[i] * pre[i - 1];
            suf[len - 1 - i] = nums[len - 1 - i] * suf[len - i];

            if (i >= (len / 2) - 1) {

                if (i == len - 2) {

                    ans[i + 1] = pre[i];
                    ans[len - 2 - i] = suf[len - 1 - i];

                } else {

                    ans[i + 1] = pre[i] * suf[i + 2];
                    ans[len - 2 - i] = pre[len - 3 - i] * suf[len - 1 - i];

                }

            }

        }
        
        if (len == 3) {

            ans[1]=pre[0]*suf[2];
        }

        

        return ans;

    }
}