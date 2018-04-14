/**
 * 
 */
package immutable;

/**
 * @author Anurag Singh
 *
 */


public final class ImmutableTest {

    /**
     * @param args
     */
    static {
        System.out.println("asas");
        System.exit(0);
        
    }
    public static void main(String[] args) {
      
            
            Immutable obj = new Immutable(10, "Anurag");
          
            System.out.println(obj.getVal1());
            System.out.println(obj.getVal2());

        }

    }
    final class Immutable
       {
           private final int val1;
           private final String val2;
               public Immutable(int a, String s)
           {
              val1 = a;
              val2 = s;
          }
            public int getVal1() {
                return val1;
            }
            public String getVal2() {
                return val2;
            }
         
      }
       
     