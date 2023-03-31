package Leetcode;

import java.util.Arrays;

public class L66WithoutInteger {


    public int[] plusOne(int[] digits) {


        for(int i = digits.length -1 ; i > 0;i--){
            if(digits[i] == 9){
                digits[i] = 0;
            }
            digits[i - 1]++;
            System.out.println(Arrays.toString(digits));
            return digits;
        }

        int [] checkNtN = new int[digits.length+1];
        checkNtN[0] = 1;

        return checkNtN;
    }
    public static void main(String[] args) {
        L66WithoutInteger obj = new L66WithoutInteger();
        obj.plusOne(new int[]{5,7,9});
    }
}
