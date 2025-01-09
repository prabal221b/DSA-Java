package Greedy;
import java.util.*;

public class JobSequencing {
    static class Job{
        int id;
        int deadline;
        int profit;
        public Job(int id, int deadline, int profit){
            this.id= id;
            this.deadline = deadline;
            this.profit = profit;
        }
        
    }
    public static void main(String[] args) {
        int[][] jobsInfo = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};

        //creating arraylist of type Job, to store objects of Job Class for eveyry job
        ArrayList<Job> jobs = new ArrayList<>();
        
        for(int i=0; i<jobsInfo.length; i++){
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
            
        }
        //sorting our object arraylist in descending order
        Collections.sort(jobs, (obj1 , obj2) -> obj2.profit - obj1.profit);

        ArrayList<Integer> seq = new ArrayList<>(); //creating arraylist of integer type to store sequuence of job that will be done
        
        int time = 0; //initliazing time as 0
        int totalProfit = 0;
        
        for(int i=0; i<jobs.size(); i++){
            Job curr = jobs.get(i);
            
            if(curr.deadline > time){
                seq.add(curr.id);
                totalProfit += curr.profit;
                time++;
            }
        }
        System.out.println("No of jobs done = "+seq.size());
        System.out.println("Profit = "+totalProfit);
        for(int i=0; i<seq.size(); i++){
            System.out.print("J"+seq.get(i)+" ");
        }



    }
}
