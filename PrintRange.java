
package labexam1;


public class PrintRange {
    public void printrangevalue(int num1,int num2){
    
        if(num1<num2){
            for(int i=num1;i<=num2;i++)
            {
                System.out.println(i);
            }
        }
       
        if(num1>num2){
            for(int i=num1;i>=num2;i--)
            {
                System.out.println(i);
            }
        }
        if(num1==num2)
        {
            System.out.println(num1);
        }
                
    }
}
