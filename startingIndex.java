class startingIndex{
    public int strStr(String heystack, String needle){
        if(heystack.length() < needle.length()) return -1;
        for(int i=0; i<=heystack.length() - needle.length()){
            int j=0;
            while(j<needle.length() && heystack.charAt(i+j)==needle.charAt(j))
            j++;
            if(j== needle.length()) return i;
        }
        return -1;
    }
}