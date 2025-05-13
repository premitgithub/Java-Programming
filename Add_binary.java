package Leetcode;
//
//public class Add_binary
//{
//    public static void main(String[] args)
//    {
//        String a = "1" , b="111";
//        System.out.println(add_bin(a,b));
//    }
//    public static String add_bin(String a, String b)
//    {
//        char ch1,ch2;
//        int len_a=a.length();
//        int len_b=b.length();
//        String new_b="",sum="",carry="";
//        int max_len=len_b,min_len=len_a;
//        if(len_a>len_b)
//        {
//            max_len=len_a;
//            min_len = len_b;
//        }
//
//        for(int i=0;i<(max_len-min_len);i++)
//        {
//            new_b = "0"+new_b;
//        }
//        if(len_a>len_b)
//        {
//            b=new_b+b;
//        }
//        else
//        {
//            a=new_b+a;
//        }
//
//
//        for(int i=max_len-1;i>=0;i--)
//        {
//            ch1=a.charAt(i);
//            ch2=b.charAt(i);
//            if(carry == "")
//            {
//                if(ch1=='0' && ch2=='0')
//                {
//                    sum = "0" + sum ;
//                    carry="";
//                }
//                else if(ch1=='0' && ch2=='1' || ch1=='1' && ch2=='0')
//                {
//                    sum = "1" + sum ;
//                    carry="";
//                }
//                else if(ch1=='1' && ch2=='1')
//                {
//                    sum = "0" + sum ;
//                    carry="1";
//                }
//            }
//            else if(carry == "1")
//            {
//                if(ch1=='0' && ch2=='0')
//                {
//                    sum = "1" + sum ;
//                    carry="";
//                }
//                else if(ch1=='0' && ch2=='1' || ch1=='1' && ch2=='0')
//                {
//                    sum = "0" + sum ;
//                    carry="1";
//                }
//                else if(ch1=='1' && ch2=='1')
//                {
//                    sum = "1" + sum ;
//                    carry="1";
//                }
//            }
//
//
//        }
//        sum = carry + sum;
//        return sum;
//    }
//}
public class Add_binary {
    public static void main(String[] args) {
        String a = "100";
        String b = "110010";
        String ans = CheckLength(a,b);
        System.out.println(ans);

    }

    static String CheckLength(String a, String b){
        int alength = a.length();
        int blength = b.length();
        if(alength > blength){
            for(int i=0 ; i<alength-blength ; i++){
                b = "0" + b;
            }
        }
        if(blength > alength){
            for(int i=0 ; i<blength-alength ; i++){
                a = "0" + a;
            }
        }
        String ans = "";
        int count=0;
        StringBuilder carry = new StringBuilder();
        carry.insert(0,0);
        for(int i=a.length()-1 ; i>=0 ; i--){
            StringBuilder ch1 = new StringBuilder();
            StringBuilder ch2 = new StringBuilder();

            ch1.insert(0,a.charAt(i));
            ch2.insert(0,b.charAt(i));
            if(carry.charAt(0) == '0' && ch1.charAt(0) == '0' && ch2.charAt(0) == '0' ){
                ans = "0" + ans;
                carry.insert(0,0);
                count++;
            } else if(carry.charAt(0) == '0' && ch1.charAt(0) == '0' && ch2.charAt(0) == '1' ){

                ans = "1" + ans;
                carry.insert(0,0);
                count++;
            } else if(carry.charAt(0) == '0' && ch1.charAt(0) == '1' && ch2.charAt(0) == '0' ){

                ans = "1" + ans;
                carry.insert(0,0);
                count++;
            } else if(carry.charAt(0) == '0' && ch1.charAt(0) == '1' && ch2.charAt(0) == '1' ){

                ans = "0" + ans;
                carry.insert(0,1);
                count++;
            } else if(carry.charAt(0) == '1' && ch1.charAt(0) == '0' && ch2.charAt(0) == '0' ){

                ans = "1" + ans;
                carry.insert(0,0);
                count++;
            } else if(carry.charAt(0) == '1' && ch1.charAt(0) == '0' && ch2.charAt(0) == '1' ){

                ans = "0" + ans;
                carry.insert(0,1);
                count++;
            } else if(carry.charAt(0) == '1' && ch1.charAt(0) == '1' && ch2.charAt(0) == '0' ){

                ans = "0" + ans;
                carry.insert(0,1);
                count++;
            } else if(carry.charAt(0) == '1' && ch1.charAt(0) == '1' && ch2.charAt(0) == '1' ){

                ans = "1" + ans;
                carry.insert(0,1);
                count++;
            }

        }
        if(ans.length()>1 && carry.charAt(0)!='0'){
            ans = carry.charAt(0) + ans;
        }else if(ans.length()==1){
            if(a.charAt(0) == '1' && b.charAt(0) =='1' && carry.charAt(0)!='0'){
                ans = carry.charAt(0) + ans;
            }else{
                return ans;
            }
        }

        return ans;

    }

}
