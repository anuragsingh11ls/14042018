package stringtockan;

import java.util.ArrayList;

public class test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        String s="1234|^test|^date";
        System.out.println(s);
        String regex="\\|";
        System.out.println("aaaaaaaaa"+s.split(regex));
        
        ArrayList<String> strings = new ArrayList<String>();
       // strings.add("bob,  anurag:singh:as,    jones,    123-333-1111");
        strings.add("1234^test^date");

                for(int i = 0; i < strings.size(); i++) {
            StringBuilder builder = new StringBuilder();
            for(String str: strings.get(i).split("\\^")) {
                builder.append(str).append(" ");
                System.out.println("eeeeeeeeeeeee"+str);
            }
            strings.set(i, builder.toString().trim());

        

    }

    }
}
