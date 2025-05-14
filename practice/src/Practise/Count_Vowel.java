package Practise;

public class Count_Vowel {
    public static void main(String[] args) {
        String s = "hello world";
        int vow_count = 0;
        int cons_count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vow_count++;
                } else {
                    cons_count++;
                }
            }
        }
        System.out.println("vowels "+vow_count +" and cons "+cons_count);
    }
}




