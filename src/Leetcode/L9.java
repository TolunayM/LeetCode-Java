package Leetcode;

public class L9 {


    public boolean isPalindrome(int x) {
        String temp = "";
        String str = String.valueOf(x);
        for(int i = 0; i < str.length();i++){
            temp = str.charAt(i) + temp;
        }
        return (str.equals(temp));
    }


    public static void main(String[] args) {
        L9 obj = new L9();
        obj.isPalindrome(123);
    }
}
