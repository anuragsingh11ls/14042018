package defaul;

public class finalTest {
    static {
        
    }
    
    public finalTest(int i){
       
    }
    
    static int i=10;
    
    public static void play(){
        System.out.println(i);
    }
    public static  void play(int i){
        //finalTest.play();
        System.out.println(i);
    }
    public static void main(String... ar){
       // i=12;
        System.out.println(i);
        finalTest.play();
        
    }

}
