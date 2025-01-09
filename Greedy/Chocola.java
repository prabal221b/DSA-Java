package Greedy;
import java.util.*;

public class Chocola {
    public static void main(String[] args) {
        //n*m chocolate
        Integer[] costVer = {2, 1, 3, 1, 4};
        Integer[] costHor = {4, 1, 2};

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h=0, v =0; //for iterating the array
        int hp =1, vp =1; //counting pieces
        int totalCost = 0; //total cost
        
        //like in merge sort(but opposite), we choose the cut with more host with preference to horizontal cost(more pieces covered)
        while(h < costHor.length && v < costVer.length){
            //checking which costs more
            if(costVer[v] <= costHor[h]){  
                totalCost += (costHor[h] * vp);
                hp++;
                h++;
            }
            else{
                totalCost += (costVer[v] * hp);
                vp++;
                v++;
            }
        }
        //for remaining pices which are left to cut after one type of cuts are done already in above steps
        while(h < costHor.length){
            totalCost += (costHor[h] * vp);
            hp++;
            h++;
        }
        while (v < costVer.length){
            totalCost += (costVer[v] * hp);
            vp++;
            v++;
        }
        System.out.println(totalCost);
    }
}
