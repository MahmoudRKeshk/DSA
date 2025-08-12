class Solution {
    boolean isEven;
    int lastnumber;
    int preLastnumber;
    
    private void save(int value){
        if (isEven){
            preLastnumber = lastnumber;
            lastnumber = value;
        }else {
            lastnumber = value;
        }
    }
    private double getMedian(){
        if (isEven){
            return ((double) lastnumber + (double) preLastnumber ) / 2;
        }else {
            return (double) lastnumber;
        }
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;
        isEven = totalLength % 2 == 0;
        int lastIndex = totalLength / 2;


        int pointerOne = 0;
        int pointerTwo = 0;
        int mainPointer = lastIndex;

        
        

        while (mainPointer >= 0) {
            if (pointerOne < nums1.length && pointerTwo < nums2.length) {
                if (nums1[pointerOne] <= nums2[pointerTwo]) {
                    mainPointer--;
                    save(nums1[pointerOne]);
                    pointerOne++;
                } else if (nums2[pointerTwo] <= nums1[pointerOne]) {
                    mainPointer--;
                    save(nums2[pointerTwo]);
                    pointerTwo++;
                }
            } else if (pointerOne < nums1.length) {
                mainPointer--;
                save(nums1[pointerOne]);
                pointerOne++;
            } else if (pointerTwo < nums2.length) {
                mainPointer--;
                save(nums2[pointerTwo]);
                pointerTwo++;
            }
        }
        return getMedian();

    }

}