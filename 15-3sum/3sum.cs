public class Solution
{
    public IList<IList<int>> ThreeSum(int[] nums)
    {
        IList<IList<int>> output = new List<IList<int>>();

        // Sorting 
        Array.Sort(nums, (a, b) => a.CompareTo(b));

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
                    Array.Sort(targetArray, (a, b) => a.CompareTo(b));;
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