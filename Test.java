import java.util.Scanner;

public class Test {

   public static void main(String args[]) {
	   System.out.println("enter traffic signal: ");
	   Scanner input=new Scanner(System.in);
	
      
      String x= input.next();
     

      if( x.equals("red")) {
         System.out.print("stop");
      }
      else if( x.equals("yellow") ) {
         System.out.print("caution and proceed");
     }
      else if(x.equals("green")) {
        System.out.print("go");
      }
      else
      {
    	  System.out.print("invalid input");
    	  
      }
      input.close();
      
   }
 }
