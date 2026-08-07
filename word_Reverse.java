import java.util.Scanner.*;

public class word_Reverse {

    public static String wordReverse(String s){
        if(s==null||s.isEmpty())return s;
        String[] parts = s.split(" ");
        StringBuffer results=new StringBuffer();
        for(int i=0;i<parts.length;i++){
            if(parts[i].equals("selenium")){
                parts[i]=new StringBuffer(parts[i]).reverse().toString();
            }
            results.append(new StringBuffer(parts[i]));
            if(i<parts.length-1)results.append(" ");

        }
        return results.toString();
    }
    public static void main(String[] args) {
        String input = "this is selenium , that is java ";
        String reversed = wordReverse(input);
        System.out.println("Reversed string: " + reversed);
    }

    
}