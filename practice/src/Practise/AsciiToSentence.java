package Practise;

public class AsciiToSentence {

    public static String asciiToSentence(String s ){
        int n=s.length();
     int num=0;
     StringBuilder res=new StringBuilder();
        for(int i=0;i<n;i++){
            num= num*10 + s.charAt(i)-'0';
            if(num>=32 && num<=122){
               res.append((char)num);
               num=0;
            }

        }



        return res.toString();
    }

    public static void main(String[] args) {
        String test = "7110110110711510211111471101101107115";
        System.out.println(asciiToSentence(test));
    }
}
