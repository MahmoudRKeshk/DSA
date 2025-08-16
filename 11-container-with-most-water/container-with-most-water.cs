public class Solution
{
    public int MaxArea(int[] height)
    {
        int maxArea = 0;
        int rightPointer = height.Length - 1;
        int leftPointer = 0;

        while (rightPointer > leftPointer)
        {
            int area = Math.Min(height[rightPointer], height[leftPointer]) * Math.Abs(leftPointer - rightPointer);
            if (height[rightPointer] < height[leftPointer])
            {
                rightPointer--;
            }
            else
            {
                leftPointer++;
            }

            if (area > maxArea)
            {
                maxArea = area;
            }
        }
        return maxArea;
    }
}