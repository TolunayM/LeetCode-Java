package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Best Time to Buy and Sell Stock - Easy
public class L121 {

    public int maxProfitV2(int[] prices){
        int profit = 0;
        int price = 0;
        if(prices.length < 2){
            return 0;
        }else{

            for(int j = prices.length - 1; j > 0; j--){
                for(int i = 0; i < j; i++){
                    price = prices[j] - prices[i];
                    if(price > profit){
                        profit = price;
                    }
                }
            }}
        return (profit);
    }


    public int maxProfit(int[] prices) {
        List<Integer> profitList = new ArrayList<>();
        // Check if can achieve profit
        if(prices.length < 2){
            return 0;
        }
        int profit = 0;
        for(int j = prices.length - 1; j > 0; j--){
            for(int i = 0; i < j; i++){

                profit = prices[j] - prices[i];
                profitList.add(profit);
            }
        }
        Collections.sort(profitList);
        System.out.println(profitList.get(profitList.size()- 1) > 0 ? profitList.get(profitList.size()- 1):0);
        return (profitList.get(profitList.size()- 1) > 0 ? profitList.get(profitList.size()- 1):0);
    }
    public static void main(String[] args) {
        L121 obj = new L121();
        obj.maxProfit(new int[]{1});
    }
}
