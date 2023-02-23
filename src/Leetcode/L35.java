package Leetcode;

public class SearchInsertPosition35 {

    public int searchInsert(int[] nums, int target) {

        // find target if exist
        int index = 0;
        int counter = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                counter += 1;
                index = i;
                break;
            }
        }

        
        if(counter == 0){
            for(int i = 0; i < nums.length; i++){
                if(target < nums[i]){
                    index = i;
                    break;
                }else if(target > nums[nums.length - 1]){
                    index = nums.length;
                    break;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        SearchInsertPositionVoid35 ob = new SearchInsertPositionVoid35();
        ob.searchInsert(new int[]{1,3,5,6},5);
    }
}
