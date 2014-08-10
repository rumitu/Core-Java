package com.hackbulgaria.corejava;

public class FaultyProblem7 {
    public static int binarySearch(int element, int... array) {
        //Utils.killMeIfIGetStuck();

        int low = 0;
        int high = array.length - 1;

        int mid = (low + high) / 2;
        while (high - low > 1) {

            if (element == array[mid]) {
                return mid;
            }
            if (element < array[mid]) {
                high = mid;
                mid--;
            } else {
                low = mid;
                mid++;
            }
            
        }

        if (element == array[high])
            return high;
        if (element == array[low])
            return low;

        return -1; // not found
    }
}
