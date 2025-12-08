import java.util.*;

public class add{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int[] res = add(arr, 5);
        System.out.println(Arrays.toString(res));
    }
    public static int[] add(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int result = target-arr[i];
            if(map.containsKey(result) && map.get(result)!=i){
                return new int[] {map.get(result), i};
            }
            map.put(arr[i], i);
        }
        return null;
    }
}