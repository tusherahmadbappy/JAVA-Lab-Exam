
package labexam1;

import java.util.Scanner;

public class Labexam1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter total call: ");
        int totalcall = s1.nextInt();
        
        for(int i=0;i<totalcall;i++)
        {
            System.out.println("Enter number1: ");
            int num1= s1.nextInt();

            System.out.println("Enter number2: ");
            int num2= s1.nextInt();
            
            PrintRange ob1 = new PrintRange();
            ob1.printrangevalue(num1, num2);
        }
       
        
        
    }
    
}
