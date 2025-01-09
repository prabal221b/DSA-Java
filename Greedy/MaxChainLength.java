package Greedy;

import java.util.*;

public class MaxChainLength {
    public static void main(String[] args) {
        int pairs[][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};

        //sort the pairs on the basis of the second number
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        
        int totalPairs = 1; //first pair will always count
        int lastEnd = pairs[0][1];

        for(int i=1; i<pairs.length; i++){
            if(pairs[i][0] >= lastEnd){
                totalPairs++;
                lastEnd = pairs[i][1];
            }
        }
        System.out.println("Max Chain length = "+totalPairs);
    }
}
