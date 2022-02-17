import java.util.Scanner;
interface RangeProduct{  
    long range(long val1,long val2);  
}  
  
public class Assignment4{  
    public static void main(String[] args) {  
        Scanner sc=new Scanner(System.in);
        RangeProduct obj= (leftVal,rightVal)->{
            long res=1;
            for(int i=0;i<=rightVal-leftVal;i++)
            {
                res=res*(leftVal+i);
            }
            return res;
        };
        long left=sc.nextLong();
        long right=sc.nextLong();
        System.out.println(obj.range(left,right));
    }
}  
