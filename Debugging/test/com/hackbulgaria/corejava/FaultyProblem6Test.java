package com.hackbulgaria.corejava;

import static org.junit.Assert.*;

import org.junit.Test;

public class FaultyProblem6Test {

    @Test
    public void test() {
        assertEquals(1, FaultyProblem6.pow(1, 999999999));
        assertEquals(33554432, FaultyProblem6.pow(2, 25));
        assertEquals(16, FaultyProblem6.pow(2, 4));
        assertEquals(1, FaultyProblem6.pow(4, 0));
    }

}
