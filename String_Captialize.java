import java.util.*;
import java.util.stream.*;

public class String_Captialize {

    public static String wordReverse(String s){
        if(s==null||s.isEmpty())return s;
        String[] parts = s.split(" ");
        StringBuffer results=new StringBuffer();

        for(String part:parts){
            results.append(part.substring(0,1).toUpperCase())
            .append(part.substring(1))
            .append(" ");
        }
    
        return results.toString();
    }
    public static void main(String[] args) {
        String input = "this is selenium , that is java ";
        String reversed = wordReverse(input);
        System.out.println("String: " + reversed);
    }

    
}