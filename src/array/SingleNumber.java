package array;

import java.util.HashSet;

public class SingleNumber {

    /**
     * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
     *
     * You must implement a solution with a linear runtime complexity and use only constant extra space.
     *
     * Example 1:
     *
     * Input: nums = [2,2,1]
     * Output: 1
     * Example 2:
     *
     * Input: nums = [4,1,2,1,2]
     * Output: 4
     * Example 3:
     *
     * Input: nums = [1]
     * Output: 1
     *
     *
     * Constraints:
     *
     * 1 <= nums.length <= 3 * 104
     * -3 * 104 <= nums[i] <= 3 * 104
     * Each element in the array appears twice except for one element which appears only once.
     * @param nums
     * @return int
     */
    public static int singleNumber(int[] nums) {
        var singles = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++) {
            if (singles.contains(nums[i]))
                singles.remove(nums[i]);
            else singles.add(nums[i]);
        }
        return (int)singles.toArray()[0];
    }

    public static void main(String[] args) {
        System.out.println("Actual:\t" + singleNumber(new int[]{2,2,1}) + "\tExpected:\t1");
        System.out.println("Actual:\t" + singleNumber(new int[]{4,1,2,1,2}) + "\tExpected:\t4");
        System.out.println("Actual:\t" + singleNumber(new int[]{1}) + "\tExpected:\t1");
    }
}
