import java.util.HashMap;


// Given two strings s and t, determine if they are isomorphic.

// Two strings s and t are isomorphic if the characters in s can be replaced to get t.

// All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

class L205 {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> hashMapT = new HashMap<>();
        String newT = "";
        for (int i = 0; i < s.length(); i++) {
           
           if(hashMapT.containsValue(s.charAt(i))){
            continue;
           }else{
            hashMapT.put(t.charAt(i),s.charAt(i));
           }    
        }
        
        for(char c : t.toCharArray()){
            newT = newT + hashMapT.get(c);
        }
        if (s.equals(t)) {
            return true;
        }
        if(newT.equals(s)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution205 obj = new Solution205();
        obj.isIsomorphic("bar", "foo");
    }
}
