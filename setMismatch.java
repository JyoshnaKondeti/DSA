class Solution{
    public int[] findErrorNums(int[] nums){
        int n=nums.length;
        int[] res=new int[2];
        boolean[] seen=new boolean[n+1];
        for(int x:nums){
            if(seen[x]) res[0]=x;
            seen[x]=true;
        }
        for(int i=1;i<=n;i++){
            if(!seen[i]){
                res[1]=i;
                break;
            }
        }
        return res;
    }
}
