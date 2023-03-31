package Leetcode;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Plus One - Easy
public class L66 {

    public int[] plusOne(int[] digits) {
        int sum = 0;
        if(digits[digits.length - 1] != 9){
            digits[digits.length - 1]++;
        }else if(digits.length == 1){
            return new int[]{1,0};
        }else{
            for(int i = 0; i < digits.length;i++){
                sum += digits[i] * Math.pow(10, digits.length - i - 1);
            }
            sum++;
            String digit = Integer.toString(sum);
            int[] nArray = new int[digit.length()];
            for(int j = nArray.length - 1; j >= 0 ;j--){
                nArray[j] = sum % 10;
                sum /= 10;
            }
            return nArray;
        }
        return digits;
    }
    public static void main(String[] args) {
        L66 obj = new L66();
        obj.plusOne(new int[]{5,7,9});
    }
}
