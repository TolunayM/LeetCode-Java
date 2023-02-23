package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L242 {

        public boolean isAnagram(String s, String t) {

            //Creating arraylist for char
            List<Character> sc = new ArrayList<>();
            List<Character> tc = new ArrayList<>();

            //adding chars to arraylist
            for(int i = 0; i < s.length();i++){
                sc.add(s.charAt(i));
            }
            for(int i = 0; i < t.length();i++){
                tc.add(t.charAt(i));
            }

            //sorting lexicographically
            Collections.sort(sc);
            Collections.sort(tc);

            // printing sorted arrays
            System.out.println(sc + " " + tc);
            System.out.println(sc.equals(tc));
            return sc.equals(tc);


        }

    public static void main(String[] args) {
        L242 t = new L242();

        t.isAnagram("da","ad");
    }
}
