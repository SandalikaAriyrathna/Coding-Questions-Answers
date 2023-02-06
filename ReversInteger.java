public class ReversInteger {
    public static void main(String[] args) {
        int[] a = { 10, 2, 25, 6, 4 };
        
        for (int t = 0; t < a.length / 2; t++) { 
            int tmp = a[t]; 
         
            a[t] = a[a.length - t - 1];  
         
            a[a.length - t- 1] = tmp;  
          
        } 
        for(int i=0; i<a.length; i++){    
          System.out.print(a[i]+",");
        }
      }
    
}
