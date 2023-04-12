import java.util.Stack;

/* 2390. Removing Stars From a String 
 Medium
 You are given a string s, which contains stars *.

 In one operation, you can:

 Choose a star in s.
 Remove the closest non-star character to its left, as well as remove the star itself.
 Return the string after all stars have been removed. */

public class L2390{

    public String removeStars(String s) {
        String newS = "";
        Stack<Character> characters = new Stack<>();
      
        for (char c : s.toCharArray()) {
            characters.push(c);
            if(characters.peek() == '*'){
                characters.pop();
                characters.pop();
            }
        }
        for(char c : characters){
            newS += c;
        }
        return newS;
    }
    public static void main(String[] args) {
        L2390 obj = new L2390();
        System.out.println(obj.removeStars("leet**cod*e"));
        
    }
}
