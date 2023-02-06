//swap two numbers without using a third variable
public class SwapNum {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        b = b + a; // now b is sum of both the numbers    
        a = b - a; // b - a = (b + a) - a = b (a is swapped)    
        b = b - a; // (b + a) - b = a (b is swapped)
        
        System.out.println(a+","+b);
      }
}
