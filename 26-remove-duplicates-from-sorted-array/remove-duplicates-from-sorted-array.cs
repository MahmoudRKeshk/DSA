public class Solution {
    public int RemoveDuplicates(int[] nums)
    {
        var pointer = 1;

        for (var i = 1; i < nums.Length; i++)
        {
            if (nums[i] == nums[pointer - 1]) continue;
            nums[pointer] = nums[i];
            pointer++;
        }

        return pointer;
    }
}