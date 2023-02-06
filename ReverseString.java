class ReverseString {
  public static void main(String[] args) {
    String a = "hello";
    String reverse = "";
  
    for (int i = 0; i <  a.length(); i++) {
     
      reverse = a.charAt(i) + reverse ;
     
    }
      System.out.println(reverse);
  }
}