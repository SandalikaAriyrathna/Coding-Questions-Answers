public class Palindrome {
    public static void main(String[] args) {
        String a = "abcbc";
        String reverse = "";
    
        for (int i = a.length() - 1; i >= 0; i--) {
            reverse += a.charAt(i);
        }
    
        System.out.println(reverse); 
    
        if (a.equals(reverse)) {
          System.out.println("Palindrome");
        }else{
          System.out.println("Not Palindrome");
        }
        
    }
    
}
