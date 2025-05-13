package Leetcode;

public class Indexof_first_Occurrence_String
{
    public static void main(String[] args)
    {
        String haystack = "mississippi", needle = "issipi";
        System.out.println("Ans = "+ strStr(haystack,needle));
    }
    public static int strStr(String haystack, String needle)
    {
        StringBuilder word= new StringBuilder();
        if(needle.length()>haystack.length())
            return -1;
        for(int i=0;i<haystack.length()-needle.length()+1;i++)
        {
            word = new StringBuilder();
            if(haystack.charAt(i) == needle.charAt(0))
            {
                for(int j=i;j<needle.length()+i;j++)
                {
                    word.append(haystack.charAt(j));
                }
                if(word.toString().equals(needle))
                {
                    return i;
                }
            }
        }
        return -1;
    }

    /*
    int count = 0;
        int length = needle.length();
        for(int i=0 ; i<=(haystack.length()-1) - (length) + 1 ; i++){
            if(needle.charAt(count) == haystack.charAt(i)){
                count++;
                for(int j=i+1 ; j<i+length ; j++){
                    if(needle.charAt(count) == haystack.charAt(j)){
                        count++;
                    }else{
                        count=0;
                        break;
                    }
                }
            }
            if(count == length){
                return i;
            }else{
                count=0;
            }
        }

        return -1;
    */
}
