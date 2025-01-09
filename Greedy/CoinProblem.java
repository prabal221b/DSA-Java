package Greedy;
import java.util.*;

public class CoinProblem {
    public static void main(String[] args) {
        int[] coins = {1,2,5,10,20,100,200,500,2000};
        int value = 4356;
        
        int totalNotes = 0;
        ArrayList<Integer> notes = new ArrayList<>(); //to store the notes

        for(int i=coins.length-1; i>=0; i--){
            while(value >= coins[i]){
                totalNotes++;
                notes.add(coins[i]);
                value -= coins[i];
            }
        }
        System.out.println(totalNotes);
        System.out.print("Notes used are ");
        for(int i=0; i<notes.size(); i++){
            System.out.print(notes.get(i)+" ");
        }
    }
}
