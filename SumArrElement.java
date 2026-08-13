// sum all the elements in an array
public class SumArrElement {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 8 };
    
        int sum = 0;
        
        for (int i=0; i<array.length; i++){
            sum += array[i];

        }
        
        
        System.out.println(sum);
      }
    
}
