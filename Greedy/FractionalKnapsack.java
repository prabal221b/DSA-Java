package Greedy;
import java.util.*;

public class FractionalKnapsack {
    public static void main(String[] args) {
        
        int[] value = {100,120,60};
        int[] weight = {20,30,10};
        int maxWeight = 50;

        //making a 2-d array to store value and weight
        double[][] items = new double[value.length][2];

        //storing the index and ratio
        for(int i=0;i<value.length;i++){
            items[i][0] = i;  //storing index
            items[i][1] = value[i]/(double)weight[i]; //storing ratio and typecasting to ensure decimal value gets store

        }
        
        //sorting the array array on the basis of ratio
        Arrays.sort(items, Comparator.comparingDouble(o -> o[1]));

        //creating totalvalue count;
        int totalValue = 0;
        
        //since array is sorted in ascending order we traverse backwards
        for(int i=value.length-1;i>=0;i--){
            int index = (int)items[i][0];  //storing index
            double ratio = items[i][1]; //storing ratio
            
            //if out weight is less than weight left we store the value
            if(weight[index] <= maxWeight){
                totalValue +=  value[index];
                maxWeight -= weight[index];
            }
            //else we store the fraction
            else{
                if(maxWeight ==0){
                    break;
                }
                totalValue += (int)(ratio * maxWeight);
                maxWeight =0;
                break;
            }
            
        }
        System.out.println(totalValue);

    }
}
