package com.app;

public class Solution {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int res = 0;
        for (int elem : A) {
            res ^= elem;
        }
        return res;
    }
}
