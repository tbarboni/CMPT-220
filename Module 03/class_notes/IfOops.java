public class IfOops {
    public static void main(String[] args) {
         int a = 7;
         int b = 42;
         int smaller = 0;
         if (a < b) { smaller = a;
         } else {
          smaller = b;
         }
        
         if (smaller == a)
         System.out.println("a is the smallest!");
    } 
}
