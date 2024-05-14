// There are n kids with candies. You are given an integer array candies, 
//where each candies[i] represents the number of candies the ith kid has,
// and an integer extraCandies, denoting the number of extra candies that you have.

// Return a boolean array result of length n, where result[i] is true if,
// after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

// Note that multiple kids can have the greatest number of candies.

import java.util.*;

class Kids_With_the_Greatest_Number_of_Candies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> ans = new ArrayList<>();

        int max = 0;
        int len = candies.length;
        for (int i = 0; i < len; i++) {

            if (candies[i] > max) {
                max = candies[i];
            }

        }
        for (int i = 0; i < len; i++) {

            if (candies[i] + extraCandies >= max) {

                ans.add(true);

            } else {

                ans.add(false);
            }

        }

        return ans;

    }
}