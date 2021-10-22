public class MaximumSubArray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                if (i < j) {
                    for (int m = i; m <= j; m++) {
                        sum = sum + nums[m];
                    }

                    if (max < sum) {
                        max = sum;
                    }
                }
                if(i==j){
                    sum = sum + nums[i];
                    if (max < sum) {
                        max = sum;
                    }
                }
            }
        }

        return max;
    }
}
