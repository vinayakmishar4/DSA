package BackTracking_Practice_Questions;

import java.util.ArrayList;
import java.util.List;

public class Permutations
{
    public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            permute(nums, 0, result);
            return result;
        }

        private void permute(int[] nums, int index, List<List<Integer>> result) {
            if (index == nums.length) {
                List<Integer> copyList = new ArrayList();
                for (int num : nums)
                    copyList.add(num);
                result.add(copyList);
                return;
            }

            for (int i = index; i < nums.length; i++) {
                swap(nums, i, index);
                permute(nums, index + 1, result);
                swap(nums, i, index); // backtrack
            }
        }

        private void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
}
