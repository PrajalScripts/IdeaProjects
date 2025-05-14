package Practise;

public class ThreadExample extends Thread {
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
    }
}
class Test {
    public static void main(String[] args) {


        ThreadExample t = new ThreadExample();
        t.start();
        t.run();//starts second thread
    }
}
