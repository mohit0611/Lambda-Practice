import java.util.*;
import java.util.Scanner;

interface StringCase{  
    String convert(String s1,String s2,String s3,String s4, String s5,String s6,String s7);  
}  
  
public class Assignment3{  
    public static void main(String[] args) {  
        Scanner sc=new Scanner(System.in);
        StringCase obj=(st1,st2,st3,st4,st5,st6,st7)->(st1.replaceAll("\\s","")+st2.replaceAll("\\s","")+st3.replaceAll("\\s","")+st4.replaceAll("\\s","")+st5.replaceAll("\\s","")+st6.replaceAll("\\s","")+st7.replaceAll("\\s","")).toUpperCase();  
        String ch1=sc.nextLine();
        String ch2=sc.nextLine();
        String ch3=sc.nextLine();
        String ch4=sc.nextLine();
        String ch5=sc.nextLine();
        String ch6=sc.nextLine();
        String ch7=sc.nextLine();
        System.out.println("The required string is: "+ obj.convert(ch1,ch2,ch3,ch4,ch5,ch6,ch7));  
          
    }  
}
