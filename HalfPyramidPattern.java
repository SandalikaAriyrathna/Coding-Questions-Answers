import java.util.*; 

public class HalfPyramidPattern {
    public static void main(String ...a){
   
    Scanner sc= new Scanner(System.in);
      
    System.out.print("Enter the number of rows for half pyramid: ");  
    int n= sc.nextInt(); 
      
    for(int i=1;i<=n;i++){
		    for(int j=1;j<=i;j++){
            System.out.print("*");
		    }
		System.out.println("");
	    }
    }
}
    
