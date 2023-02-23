package Leetcode;

public class SearchInsertPosition35 {
    public void searchInsert(int[] nums, int target) {

        // find target if exist
        boolean found = false;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                found = true;
                System.out.println(i);;

            }
        }
        if(!found){
            for(int i = 0; i < nums.length; i++){
                if(target < nums[i]){
                    System.out.println(i);
                    break;
                }else if(target > nums[nums.length - 1]) {
                    System.out.println(nums.length);
                    break;
                }
            }
        }

    }

    public static void main(String[] args) {
        SearchInsertPosition35 ob = new SearchInsertPosition35();
        ob.searchInsert(new int[]{1,3,5,6},2);
    }
}
