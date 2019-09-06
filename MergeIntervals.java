/*Given a collection of intervals, merge all overlapping intervals.

Example 1:

Input: [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
Example 2:

Input: [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
NOTE: input types have been changed on April 15, 2019. Please reset to default code definition to get new method signature.*/


/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        int i=0,j;
        List<Interval> removals=new ArrayList<Interval>();
        Collections.sort(intervals, new Sortbyroll());
        while(i<intervals.size())
        {
            j=0;
            while(j<intervals.size())
            {
                //System.out.println(j);
            
            if(j!=i)
            {
                if((intervals.get(i).start<=intervals.get(j).start&&intervals.get(j).start<=intervals.get(i).end))
                {
                    if(intervals.get(j).end>intervals.get(i).end)
                    { 
                        intervals.get(i).end=intervals.get(j).end;
                        intervals.get(j).end=-1;
                        intervals.get(j).start=1;
                        removals.add(intervals.get(j));
                    }
                    else 
                    {
                       intervals.get(j).end=-1;
                        intervals.get(j).start=1;
                        removals.add(intervals.get(j));
                    }
                    
                    
                    
                }
                else if(intervals.get(i).start>intervals.get(j).start&&intervals.get(j).start<=intervals.get(i).end&&intervals.get(j).end>=intervals.get(i).start)
                {
                    if(intervals.get(j).end<=intervals.get(i).end)
                    {
                       intervals.get(i).start=intervals.get(j).start;
                        intervals.get(j).end=-1;
                        intervals.get(j).start=1;
                      //  System.out.println(intervals.get(i));
                        removals.add(intervals.get(j));
                    }
                    else 
                    {
                        intervals.get(i).start=intervals.get(j).start;
                        intervals.get(i).end=intervals.get(j).end;
                         intervals.get(j).end=-1;
                        intervals.get(j).start=1;
                        removals.add(intervals.get(j));
                    }
                }
               
                   
            }
                j++; 
        }
        
        i++;
        }
        if(removals.size()>=1)
       intervals.removeAll(removals);
        
        return intervals;

    }
    
}
class Sortbyroll implements Comparator<Interval> 
{ 
    // Used for sorting in ascending order of 
    // roll number 
    public int compare(Interval a, Interval b) 
    { 
        return a.start - b.start; 
    } 
}