package SerilizeAndDeseralize;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserializer {

    public static void main(String args[]) {

        Deserializer deserializer = new Deserializer();
        Student student = deserializer.deserialzeAddress();
        System.out.println(student);
    }

    public Student deserialzeAddress() {

        Student student;

        try {

            FileInputStream fin = new FileInputStream("D://aug3/asdf/src/SerilizeAndDeseralize/anu.txt");
            ObjectInputStream ois = new ObjectInputStream(fin);
            student = (Student) ois.readObject();
            ois.close();

            return student;

        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
/*
class Address {
    private int pid;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPaddress() {
        return paddress;
    }

    public void setPaddress(String paddress) {
        this.paddress = paddress;
    }

    private String pname;
    private String paddress;
}
*/