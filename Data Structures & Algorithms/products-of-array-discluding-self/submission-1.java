class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int[] out = new int[nums.length];
        int tempProduct = 1;
        for(int i=0;i<nums.length;i++){
            out[i] = tempProduct;
            tempProduct=tempProduct*nums[i];
        }
        
        tempProduct = 1;
        for(int i=nums.length-1;i>=0;i--){
            out[i] = out[i]*tempProduct;
            tempProduct = tempProduct*nums[i];
        }
        return out;
    }
}  
