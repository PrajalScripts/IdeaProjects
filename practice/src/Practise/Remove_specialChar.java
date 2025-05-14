package Practise;

public class Remove_specialChar {
    public static String remove_char(String str){
        int n = str.length();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch= str.charAt(i);
            if(Character.isLetterOrDigit(ch)){
               res.append(ch);
            }
        }

        return res.toString();
    }

    public static void main(String[] args) {
        String test= " Xcelore # $ ! is a GrowINg Comp@ny%$&*#$";
        System.out.println(remove_char(test));
    }
}
