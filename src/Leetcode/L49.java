package Leetcode;

import java.util.*;

//Group Anagrams - Medium

public class L49 {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> strList = new ArrayList<>();

        if(strs.length == 0){
            return strList;
        }
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            int[] alph = new int[26];

            for(char c : s.toCharArray()){
                alph[c - 'a']++;
                System.out.println(c - 'a');
            }

            String key = new String(Arrays.toString(alph));

            map.computeIfAbsent(key,k-> new ArrayList<>());
            map.get(key).add(s);
        }
        strList.addAll(map.values());
        return strList;
        }
    public static void main(String[] args) {
        L49 obj = new L49();

        // expected [["bat"],["nat","tan"],["ate","eat","tea"]]
        obj.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
    }
    }


