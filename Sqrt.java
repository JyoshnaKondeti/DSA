public class Sqrt{
    public static int result(int x){
        if (x==0 || x==1) return x;
        int result =0;
        int left= 1;
        int right = x;
        while (left<=right){
            int mid = left + (right-left)/2;
            long square = (long) mid*mid;
            if(square==x) return mid;
            else if(square<x){
               result =mid;
               left = mid+1;
            }    
            else right=mid-1;
        }
        return result;
    }
}


