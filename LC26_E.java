// Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new length.
// Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

// Sort the array, which is O(nlogn) + O(n) and space complexity O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        Arrays.sort(nums);
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}

// create a set of space complexity O(n), O(n) runtime
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        Set<Integer> set = new HashSet<>();
        int slow = 0;
        set.add(nums[slow]);
        for (int fast = 1; fast < nums.length; fast++) {
            if (!set.contains(nums[fast])) {
                slow++;
                nums[slow] = nums[fast];
                set.add(nums[fast]);
            }
        }
        return set.size();
    }
}