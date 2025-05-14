//Input: str =  “for”
//Output: 109
//        ‘f’= 102, ‘o’ = 111, ‘r’ = 114
//        (102 + 111 + 114)/3 = 109
//
        package Practise;

public class Avg_Ascii {
    public static int avg(String str){

        int sum=0;
        int n=str.length();
        if(str.isEmpty())return 0;
        for(int i =0;i<n;i++){
            int temp =(int)str.charAt(i);
            sum+=temp;
        }
        return sum/n;
    }

    public static void main(String[] args) {
        String s="for";
        System.out.println(avg(s));
    }
}
