//11.Container With Most Water - Medium 

/*You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (right, 0) and (right, height[right]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container. */

public class L11 {

    public static int maxArea(int[] height) {
      
        int max = Integer.MIN_VALUE;
        int res = 0;
        int left = 0;
        int right = height.length - 1;

        while(left < right){
            if(height[left] <= height[right]){  
                    res = (height[left]) * (right - left);
                    left++;
                    
                }else{ 
                    res = height[right] * (right - left);
                    right--;
                    }
            if(res > max){
                max = res;
                }  
}
        return max;
        
    }
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
