class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] res = new int[nums.length];

        int prev = 1;

        for (int i = 0; i < nums.length; i++) {
            res[i] = prev;
            prev *= nums[i];
        }
        prev = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] *= prev;
            prev *= nums[i];
        }

        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = { 1, 2, 3, 4 };
        int[] result = solution.productExceptSelf(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}