import java.util.*;
import java.util.stream.Collectors; 
interface DistinctString{
    void distinctString(List<String> list);
}

public class Main{
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Enter String:");
        str = sc.nextLine();
        List<String> strToList = Arrays.asList(str.split("\\s+"));
        DistinctString obj = (List<String> List)-> { System.out.println(List.stream().sorted().distinct().collect(Collectors.toList()));};
        obj.distinctString(strToList);
        }
        finally{
            sc.close();
        }
        
    }
}
