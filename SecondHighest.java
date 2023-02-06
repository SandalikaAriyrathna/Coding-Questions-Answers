//find the second largest number in an array
public class SecondHighest {
    private static int findSecondHighest(int[] array) {

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        
        for (int i : array) {
            if (i > highest) {
                secondHighest = highest;
                highest = i;
            } else if (i > secondHighest) {
                secondHighest = i;
            }
        }
        return secondHighest;
    }
    
    public static void main(String[] args) {
      int[] array = {5,10,8,90,150};
     
      System.out.println(findSecondHighest(array));
      
    }
    
}
