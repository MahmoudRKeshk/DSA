class Solution {
        public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        // Iterating
        int indexOne = 0;
        int indexTwo = 0;
        for (int i = 0; i < nums.length; i++) {
            int complimentNumber = target - nums[i];
            Integer targetIndex = map.get(complimentNumber);
            if (targetIndex == null) continue;
            indexOne = i;
            indexTwo = targetIndex;

            if (i != targetIndex){
                break;
            }
        }
        return new int[]{indexOne, indexTwo};
    }

}