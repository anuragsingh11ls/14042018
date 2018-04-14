package SerilizeAndDeseralize;

import java.io.*;
class Persist{
 public static void main(String args[])throws Exception{
  Student s1 =new Student(211,"anurag");

  FileOutputStream fout=new FileOutputStream("D://aug3/asdf/src/SerilizeAndDeseralize/anu.txt");
  ObjectOutputStream out=new ObjectOutputStream(fout);

  out.writeObject(s1);
  out.flush();

  System.out.println("success");
 }
}