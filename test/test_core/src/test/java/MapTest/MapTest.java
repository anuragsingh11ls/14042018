package MapTest;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
       HashMap m=new HashMap();
       Map m1= Collections.synchronizedMap(m);
       m.put(1,"anurag");
       m.put(3, "asdf");
       m.put(2, "singh12");
       m.put(3, "singh1");
       m.put(2, "singh12");
       System.out.println("===="+m);
       Set s=m.entrySet();
     // Set s1=Collections.synchronizedSet(s);
       for (Object object : s) {
        System.out.println(object);
    }

    }

}
