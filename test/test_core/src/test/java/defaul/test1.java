package defaul;
import java.util.ArrayList;
import java.util.List;


public class test1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] s={"the helo,the one,the plus"};

        ArrayList<String> strings = new ArrayList<String>();
        strings.add("bob,  anurag:singh:as,    jones,    123-333-1111");
        strings.add("james, lee,  234-333-2222");

        System.out.println("fffffffff"+strings);


        for(int i = 0; i < strings.size(); i++) {
            StringBuilder builder = new StringBuilder();
            for(String str: strings.get(i).split(",\\s*")) {
                builder.append(str).append(" ");
                System.out.println("eeeeeeeeeeeee"+str);
            }
            strings.set(i, builder.toString().trim());




        }
    }
}


