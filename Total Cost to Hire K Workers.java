//Priority Queue
class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        int n = costs.length;
        long ans = 0;
        if(candidates*2+k > n){
            Arrays.sort(costs);
            for(int i=0;i<k;i++){
                ans+=costs[i];
            }
            return ans;
        }

        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();

        for(int i=0;i<candidates;i++){
            pq1.offer(costs[i]);
            pq2.offer(costs[n-1-i]);
        }

        int i = candidates;
        int j = n-1-candidates;

        while(k-- > 0){
            if(pq1.peek()<=pq2.peek()){
                ans+=pq1.poll();
                pq1.offer(costs[i++]);
            }
            else{
                ans+=pq2.poll();
                pq2.offer(costs[j--]);
            }
        }
        return ans;
    }
}
