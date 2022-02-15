import java.util.*;  
import java.util.stream.Stream;

public class MyClass {
    public static void main(String args[]) {
Scanner sc= new Scanner(System.in);   
System.out.print("Enter first number- ");  
int a= sc.nextInt();  
System.out.print("Enter second number- ");  
int b= sc.nextInt();  

Stream.of(a, b).max(Comparator.comparing(i -> i))
.ifPresent(maxInt->System.out.println("Maximum number in the set is " + maxInt));
    }
}
