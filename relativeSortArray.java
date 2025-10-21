class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int num: arr1){
            countMap.put(num, countMap.getOrDefault(num,0)+1);
        }
        int index=0;
        for(int num: arr2){
            int count = countMap.get(num);
            for(int i=0; i<count; i++){
                arr1[index++] = num;
            }
            countMap.remove(num);
        }
        List<Integer> list = new ArrayList<>();
        for(int num: countMap.keySet()){
            int count = countMap.get(num);
            for(int i=0; i<count; i++){
                list.add(num);
            }
        }
        Collections.sort(list);
        for(int num: list){
            arr1[index++] = num;
        }
        return arr1;
    }
}