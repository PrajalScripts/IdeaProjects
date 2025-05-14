package Practise;

public class FindSecLar_Smallest {
    public static void main(String[] args) {
        int []arr= {34,6,8,3,15,67,43};
        int smallest=Integer.MAX_VALUE;
        int largest=Integer.MAX_VALUE;
        int n=arr.length;
        int secLarge=find_secLar(arr);
        int sec_small=find_small(arr);
        System.out.println(secLarge+" "+ sec_small);

    }
    public static int find_small(int []arr){
        int sec_small=0;
        int smallest=arr[0];
        int n=arr.length;
        for (int i = 0; i <n; i++) {
            if(arr[i]<smallest){
                sec_small=smallest;
                smallest=arr[i];

            }
            if(arr[i]!=smallest && arr[i]<sec_small){
                sec_small=arr[i];
            }
        }
        return sec_small;
    }
    public static int find_secLar(int []arr){
        int sec_lar=0;
        int largest=arr[0];
        int n=arr.length;
        for (int i = 0; i <n; i++) {
            if(arr[i]>largest ){
                sec_lar=largest;
                largest=arr[i];

            }
            if(arr[i]!=largest && arr[i]>sec_lar){
                sec_lar=arr[i];
            }
        }
        return sec_lar;
    }
}
