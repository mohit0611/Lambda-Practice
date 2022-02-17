import java.util.Scanner;
interface NextEven{  
    long even(long value2);  
}  
  
public class Assignment2{  
    public static void main(String[] args) {  
        Scanner sc=new Scanner(System.in);
        NextEven obj=(value1)->((value1%2==0)?value1+2:value1+1);  
        long value2= sc.nextLong();
        System.out.println("The Even number that comes next is: "+ obj.even(value2));  
          
    }  
}  
