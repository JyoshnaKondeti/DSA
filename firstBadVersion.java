public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low =0, high = n;
        while(low<=high){
            int mid = low+(high-low)/2;
            boolean result = isBadVersion(mid);
            if(result==false) low = mid+1;
            else high = mid-1; 
        }
        return low;
    }
}