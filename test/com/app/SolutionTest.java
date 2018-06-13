package com.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void empty() {
        Solution solution = new Solution();
        assertEquals(0, solution.solution(new int[]{}));
    }

    @Test
    public void single() {
        Solution solution = new Solution();
        assertEquals(34, solution.solution(new int[]{34}));
    }

    @Test
    public void three() {
        Solution solution = new Solution();
        assertEquals(35, solution.solution(new int[]{34, 34, 35}));
    }

    @Test
    public void multipleRepetitions() {
        Solution solution = new Solution();
        assertEquals(35, solution.solution(new int[]{34, 34, 34, 35, 34}));
    }

}