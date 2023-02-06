//Find the number of occurrences of a character in a String
public class NoOfOcc {
    public static void main(String[] args) {
        String a = "ababa";
    
        //1-reverse
        String reverse = "";
        
        for (int i = 0; i < a.length(); i++) {   
             reverse = a.charAt(i) + reverse;  
        }
        System.out.println(reverse);
    
        //2-Palindrome
        if (a.equals(reverse)) {
            System.out.println("Palindrome");   
        } else {
                System.out.println("Not Palindrome");    
        } 
    
        //3-search
        int count = 0;
        char search = 'a';   
        
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == search) {
                count++;  
            }  
        }   
        System.out.println(count);
        
          }
    
}
