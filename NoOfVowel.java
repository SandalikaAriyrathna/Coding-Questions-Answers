//calculate the number of vowels and consonants in a String
public class NoOfVowel {
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
        
        for (int j = 0; j < a.length(); j++) {
            if (a.charAt(j) == search) {
                count++;  
            }  
        }   
        System.out.println(count);
    
        //4
        int  vowels = 0;
        int consonants = 0;
        
        for (int k = 0; k < a.length(); k++) {
            char c = a.charAt(k);   
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')  
                vowels++;
            else
                consonants++;   
        }
        System.out.println("Vowel count is " + vowels);
        System.out.println("Consonant count is: " + consonants);
        
          }
    
}
