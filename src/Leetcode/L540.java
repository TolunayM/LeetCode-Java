package Leetcode;

public class L540 {

    public int singleNonDuplicate(int[] nums) {
        int index = 0;
        if(nums.length > 1){
            for(int i = 0; i < nums.length - 1;i+=2){
                if(nums[i] != nums[i + 1]){
                    index = nums[i];
                    break;
                }else if(nums.length >= 3){
                    index = nums[nums.length - 1];
                }
            }
        }else {
            index = nums[0];
        }

        System.out.println(index);
        return index;
    }

    public static void main(String[] args) {
        L540 obj = new L540();
        obj.singleNonDuplicate(new int[]{1,1,2});
    }
}
