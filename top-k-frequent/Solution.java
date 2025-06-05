import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();

        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        List<int[]> arr = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            arr.add(new int[] { entry.getValue(), entry.getKey() });
        }

        arr.sort((a, b) -> b[0] - a[0]);

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = arr.get(i)[1];
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int k = 2;
        int[] result = solution.topKFrequent(nums, k);
        System.out.println(Arrays.toString(result));
    }
}