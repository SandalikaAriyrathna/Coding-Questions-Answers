
import java.util.*;  

class RightHalfPyramidPattern{
    public static void main(String[] args){
  
    Scanner sc= new Scanner(System.in);
      
    System.out.print("Enter the number of rows for half pyramid: ");  
    int n= sc.nextInt();  
      
    for(int i=n;i>=1;i--){
		    for(int j=i;j>=2;j--){
                     System.out.print(" ");
		    }
		    for(int k=1;k<=n-i+1;k++){
		        System.out.print("*");
		    }
		System.out.println("");
	    }
    }
} 

