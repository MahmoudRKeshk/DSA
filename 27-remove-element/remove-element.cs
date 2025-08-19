public class Solution {
   public int RemoveElement(int[] nums, int val)
{
    int k = 0; // Pointer for the position to place the next element not equal to val
    for (int i = 0; i < nums.Length; i++)
    {
        if (nums[i] != val)
        {
            nums[k] = nums[i]; // Place the element at index k
            k++; // Increment k
        }
    }
    return k;
}
}