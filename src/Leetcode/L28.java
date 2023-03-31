package Leetcode;


//Find the Index of the First Occurrence in a String - Easy
public class L28 {

    public int strStr(String haystack, String needle) {
        //NO NEED FOR CHECKING IF IT CONTAINS BUT ITS VISUALLY GOOD
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }

    public static void main(String[] args) {
        L28 obj = new L28();
        obj.strStr("hellobitchesbitchesbitches","hes");
    }
}
