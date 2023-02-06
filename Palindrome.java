public class Palindrome {
    public static void main(String[] args) {
        String a = "abcbc";
        String reverse = "";
        
        for (int i = 0; i < a.length(); i++) {   
             reverse = a.charAt(i) + reverse;  
        }
        System.out.println(reverse);
    
        if (a.equals(reverse)) {
            System.out.println("Palindrome");   
        } else {
                System.out.println("Not Palindrome");    
        }       
          }
    
}
