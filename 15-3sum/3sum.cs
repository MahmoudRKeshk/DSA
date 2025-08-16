public class Solution
{
    public void BubbleSort(ref int[] nums)
    {
        // Sorting
        for (int i = 0; i < nums.Length - 1; i++)
        {
            for (int j = 0; j < nums.Length - i - 1; j++)
            {
                if (nums[j] > nums[j + 1])
                {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
    public IList<IList<int>> ThreeSum(int[] nums)
    {
        IList<IList<int>> output = new List<IList<int>>();

        // Sorting 
        BubbleSort(ref nums);

        // Prevent Duplicates 
        HashSet<string> ProcessedValues = new HashSet<string>();

        for (int i = 0; i < nums.Length; i++)
        {
            int j = i + 1;
            int k = nums.Length - 1;
            while (k > j)
            {
                int temp = nums[j] + nums[k] + nums[i];
                if (temp > 0)
                {
                    k--;
                }
                else if (temp < 0)
                {
                    j++;
                }
                else if (temp == 0)
                {
                    var targetArray = new int[] { nums[j], nums[k], nums[i] };
                    BubbleSort(ref targetArray);
                    if (!ProcessedValues.Contains($"{targetArray[0]}{targetArray[1]}{targetArray[2]}"))
                    {
                        ProcessedValues.Add($"{targetArray[0]}{targetArray[1]}{targetArray[2]}");
                        output.Add(targetArray);
                    }
                    j++;
                    k--;
                }
            }
        }

        return output;
    }




}