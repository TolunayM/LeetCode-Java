package Leetcode;

// Valid Palindrome - Easy

public class L125 {
    public boolean isPalindrome(String s) {

        if(s == " "){
            return true;
        }
        String newS = s.toLowerCase();
        newS = newS.replaceAll("[^a-zA-Z0-9]","");

        String temp = "";
        for(int i = 0; i < newS.length(); i++){
            temp = newS.charAt(i) + temp;
        }

        return (newS.equals(temp) ? true:false);
    }

    public static void main(String[] args) {
        L125 obj = new L125();
        obj.isPalindrome("Live on evasions? No, I save no evil.");
    }
}
