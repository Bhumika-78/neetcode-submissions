class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = 0;
        for(int pile : piles) high = Math.max(high, pile);
        while(low <= high){
            int mid = low + (high - low)/2;
            if(totalHours(piles, mid) <= h) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }
    public long totalHours(int[] piles, long speed){
        long totalH = 0;
        for(int pile : piles) totalH += (pile + speed - 1)/speed;
        return totalH;
    }
}
