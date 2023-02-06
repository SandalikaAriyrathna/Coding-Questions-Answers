public class BubleSort {
    public static void main(String[] args) {
    int[] a = { 8,25,1, 2, 7, 6, 4, 9, 9, 1, 5, 12, 0, 3,4 };

    for (int k = 0; k < a.length; k++) {
        for (int l = 0; l < a.length - 1; l++) {
            if (a[l] > a[l + 1]) {
                int t = a[l];
                a[l] = a[l + 1];
                a[l + 1] = t;            
            }
        }    
    }
    for(int i=0; i<a.length; i++){    
      System.out.println(a[i]);     
    }
     
  }
    
}
