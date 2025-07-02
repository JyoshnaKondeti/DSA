public class LengthOfLastWord{
    public int length(String str){
        int length=0;
        int i=str.length()-1;
        while(i>=0 && str.charAt(i)==' ') i--;
        while(i>=0 && str.charAt(i)!=' ') {
            length ++;
            i--;
        }
        return length;
    }
}