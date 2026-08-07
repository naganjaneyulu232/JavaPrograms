import java.util.Scanner.*;

public class word_count {

    public static int wordReverse(String s,String w){
        if(s==null||s.isEmpty())return 0;
        String[] parts = s.split(" ");
        StringBuffer results=new StringBuffer();
        int count=0;
        for(int i=0;i<parts.length;i++){
            if(parts[i].equals(w)){
                count++;
            }
            results.append(new StringBuffer(parts[i]));
            if(i<parts.length-1)results.append(" ");

        }
        return count;
    }
    public static void main(String[] args) {
        String input = "this is selenium , that is java ";
        String word = "is";
        int wordcount = wordReverse(input,word);
        System.out.println("word count of "+word+" : " + wordcount);
    }

    
}