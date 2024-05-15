
// You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

// Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n,
// return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.

class Can_Place_Flowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int len = flowerbed.length;

        if (n == 0) {
            return true;
        }

        if (len == 1 && flowerbed[0] == 0 && n <= 1) {
            return true;
        }
        if (len == 1 && flowerbed[0] == 1) {
            return false;
        }

        for (int i = 0; i < len; i++) {

            if (flowerbed[i] == 0) {

                if (i == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                } else if (i == (len - 1) && flowerbed[len - 2] == 0) {
                    flowerbed[i] = 1;
                    n--;
                } else if (i > 0 && i < len) {
                    if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                        flowerbed[i] = 1;
                        n--;
                    }
                }
            }
            if (n == 0) {
                return true;
            }
        }
        return false;
    }
}