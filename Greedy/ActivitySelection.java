package Greedy;
import java.util.*;

public class ActivitySelection {
    public static void main(String[] args) {
        int[] start = {1,3,0,5,8,5};
        int[] end = {2,4,6,7,9,9};

        //making a 2-d array to store index, start time and end time resp
        int[][] activities = new int[start.length][3];

        //storing the data
        for(int i=0;i<start.length;i++){
            activities[i][0] = i;  //storing index
            activities[i][1] = start[i];  //storing start time
            activities[i][2] = end[i]; //storing end time
        }
        
        //sorting the activities array on the basis of end time
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        //creating an arraylist to add the activites which can be done
        ArrayList<Integer> act = new ArrayList<>();

        int maxActivities =1; //first activity will always be done
        act.add(activities[0][0]); //adding the first activity to the answer
        int lastEnd = activities[0][2]; //storing the end time of the first activity

        for(int i=0;i<start.length;i++){
            if(activities[i][1] >= lastEnd){
                maxActivities++;
                act.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("Max activities :"+maxActivities);

        for(int i=0;i<act.size();i++){
            System.out.println("A"+act.get(i));
        }

    }
}
