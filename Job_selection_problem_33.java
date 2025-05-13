package Greedy_algorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Job_selection_problem_33
{
    static class Job{
        int deadline;
        int profit;
        int id;
        public Job(int id,int deadline,int profit)
        {
            //for id 0 means A ,1 means B ,2 means C
            this.id=id;
            this.deadline=deadline;
            this.profit=profit;
        }
    }
    public static void main(String[] args)
    {
        int[][] jobsInfo={{4,20},{1,10},{1,40},{1,30}};
        ArrayList<Job> jobs=new ArrayList<>();
        for(int i=0;i<jobsInfo.length;i++)
        {
            jobs.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
        }
        //sorting in descending order
        Collections.sort(jobs,(obj1,obj2) -> obj2.profit-obj1.profit);
        ArrayList<Integer> seq=new ArrayList<>();
        int time=0;
        for(int i=0;i<jobs.size();i++)
        {
            Job curr=jobs.get(i);
            if(curr.deadline>time)
            {
                time++;
                seq.add(curr.id);
            }
        }
        System.out.println("Max jobs = "+ seq.size());
        for(int i=0;i<seq.size();i++)
        {
            System.out.print(seq.get(i) + " ");
        }
    }
}
