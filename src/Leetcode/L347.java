package Leetcode;

import java.util.*;

// Top K Frequent Elements - Medium
public class L347 {

    public void topKFrequent(int[] nums, int k) {

        // Check if numss size only 1
        if(nums.length == 1){
            System.out.println(nums);
        }
        // sort nums. nums may be given in mixed order
        Arrays.sort(nums);

        // hashmap for key = nums value = count
        HashMap<Integer,Integer> map = new HashMap<>();

        int key = nums[0],count = 1;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]){
                key = nums[i];
                count++;
                map.put(key,count);
            }if(nums[i] != nums[i + 1]){
                map.put(key,count);
                key = nums[i+1];
                count = 1;
            }
        }



        // EXPERIMENTAL

        List<Map.Entry<Integer, Integer> > list =
                new LinkedList<Map.Entry<Integer, Integer> >(map.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        int[] keysArray = new int[10];
        // put data from sorted list to hashmap
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
            keysArray[list.indexOf(aa)] = aa.getKey();
        }

        int[] realKeys = new int[k];

        List keys = new ArrayList(temp.keySet());

        System.out.println("Without sorted " + map);
        System.out.println(realKeys);
        System.out.println("Sorted " + temp);
        System.out.println("keys " + Arrays.toString(keysArray));




    }

    public static void main(String[] args) {
        L347 obj = new L347();
        obj.topKFrequent(new int[]{3,0,1,1,1,2,2,2,2,1,0},2);
    }
}
