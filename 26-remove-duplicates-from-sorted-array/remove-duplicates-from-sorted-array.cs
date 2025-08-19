public class Solution {
    public int RemoveDuplicates(int[] nums)
    {
        var queue = new Queue<int>();
        int uniqueNumbers = 0;
        var set = new HashSet<int>();

        for (int i = 0; i < nums.Length; i++)
        {
            if (set.Add(nums[i]))
            {
                uniqueNumbers++;
                if (queue.Count > 0)
                {
                    nums[queue.Dequeue()] = nums[i];
                    nums[i] = '_';
                    queue.Enqueue(i);
                }
                continue;   
            }
            queue.Enqueue(i);
            nums[i] = '_';
        }

        return uniqueNumbers;
    }
}