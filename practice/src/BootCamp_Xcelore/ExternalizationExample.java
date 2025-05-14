package BootCamp_Xcelore;

import java.io.*;

class B implements Externalizable {
    int i;
    String s;

    public B() {
        //no arg constructor
    }

    // A class constructor
    public B(int i, String s)
    {
        this.i = i;
        this.s = s;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
      out.writeObject(s);
      out.writeInt(i);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        s=(String)in.readObject();
        i=in.readInt();
    }
}
public class ExternalizationExample {
    public static void main(String[] args)
            throws IOException, ClassNotFoundException
    {
        B b = new B(20,"GeeksForGeeks");

        // Serializing 'a'
        FileOutputStream fos
                = new FileOutputStream("xyz.txt");
        ObjectOutputStream oos
                = new ObjectOutputStream(fos);
        oos.writeObject(b);

        // De-serializing 'a'
        FileInputStream fis
                = new FileInputStream("xyz.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        b = (B)ois.readObject(); // down-casting object

        System.out.println(b.i + " " + b.s);

        // closing streams
        oos.close();
        ois.close();
    }
}
