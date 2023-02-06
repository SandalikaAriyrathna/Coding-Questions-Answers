public class InsertionSort {
    public static void main(String[] args) {
        int[] a = { 10, 0, 7, 6, 4, 0, 12, -1 ,-2};
    
        for (int m = 0; m < a.length; m++) {
           for (int n = m; n > 0 && a[n - 1] > a[n]; n--) {      
                int k = a[n];
                a[n] = a[n - 1];
                a[n - 1] = k;       
            }  
        }
        for(int i=0; i<a.length; i++){
          System.out.println(a[i]);    
        }
      }
    
}
