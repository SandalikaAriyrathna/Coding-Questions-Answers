//find the second largest number in an array
public class SecondHighest {
    private static int findSecondHighest(int[] array) {
 
    int[] array = {5, 10, 8, 90, 150};

    int max = array[0];
    int secondMax = array[1];

    if (secondMax > max) {
        // Swap
        int temp = max;
        max = secondMax;
        secondMax = temp;
    }

    for (int i = 2; i < array.length; i++) {
        if (array[i] > max) {
            secondMax = max;
            max = array[i];
        } else if (array[i] > secondMax && array[i] != max) {
            secondMax = array[i];
        }
    }

    System.out.println("Second highest: " + secondMax);
    
    }
    
}
