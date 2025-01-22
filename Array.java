public class Array {

    // merge two sorted arrays(in ascending order) into a single sorted array(ascending order) in nums1
    // n = number of elements in nums2 m = number of elements in nums1
    // m+n = length of nums 1
    public void mergeASC(int m, int n, int[] nums1, int[] nums2){
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(j>=0){
            if(i>=0 && nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }else{
                nums1[k--] = nums2[j--];
            }
        }
    }

    // merge two sorted arrays(in descending order) into a single sorted array(descending order) in nums1
    // n = number of elements in nums2 m = number of elements in nums1
    // m+n = length of nums 1
    public void mergeDESC(int m, int n, int[] nums1, int[] nums2){
        int i = n;
        int j = 0;
        int k = 0;
        if(m==0){
            nums1[k] = nums2[j];
        }
        while(j<n){
            if(i<m+n && nums1[i]>nums2[j]){
                nums1[k++] = nums1[i++];
            }else{
                nums1[k++] = nums2[j++];
            }
        }
    }

    // merge two sorted arrays(in descending order) into a single sorted array(descending order) in nums1
    // n = number of elements in nums2 m = number of elements in nums1
    // m+n = length of nums 1
    public void mergeDESC2(int m, int n, int[] nums1, int[] nums2){
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(j>=0){
            if(i>=0 && nums1[i] < nums2[j]){
                nums1[k--] = nums1[i--];
            }else{
                nums1[k--] = nums2[j--];
            }
        }
    }
    public static void main(String[] args) {
        Array array = new Array();
        // int[] nums1 = {1, 2, 6, 0, 0, 0}; 
        // int[] nums2 = {3, 5, 7};
        // array.mergeASC(3,3, nums1, nums2);
        // System.out.println(java.util.Arrays.toString(nums1));

        // int[] nums1 = {0,0,0,7, 4, 1};
        // int[] nums2 = {5, 2, 1};
        // array.mergeDESC(3, 3, nums1, nums2);
        // System.out.println(java.util.Arrays.toString(nums1));

        // int[] nums1 = {7, 4, 1, 0, 0, 0};
        // int[] nums2 = {5, 2, 1};
        // array.mergeDESC2(3, 3, nums1, nums2);
        // System.out.println(java.util.Arrays.toString(nums1));

                
        // int[] nums1 = {1}; 
        // int[] nums2 = {};
        // array.mergeASC(1,0, nums1, nums2);
        // array.mergeDESC(1, 0, nums1, nums2);
        // array.mergeDESC2(1, 0, nums1, nums2);
        // System.out.println(java.util.Arrays.toString(nums1));

        int[] nums1 = {0}; 
        int[] nums2 = {2};
        // array.mergeASC(0,1, nums1, nums2);
        array.mergeDESC(0, 1, nums1, nums2);
        array.mergeDESC2(0, 1, nums1, nums2);
        System.out.println(java.util.Arrays.toString(nums1));
    }
}
