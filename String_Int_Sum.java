import java.util.*;

public class String_Int_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String word=sc.next();

        int count=0;

        for(int i=0;i<word.length();i++){ 
            if(Character.isDigit(word.charAt(i))){
                int j=word.charAt(i)-'0';
                count=count+j;
            }
        }

        System.out.println(count);
    }
}
