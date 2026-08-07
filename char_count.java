import java.util.*;

public class char_count {
public static void main(String[] args) {
    String input = "Govardhan";
    int[] c=new int[256];
    for(char ch:input.toCharArray()){
        c[ch]++;
    }

    for(int i=0;i<c.length;i++){
        if(c[i]>0){
            System.out.println((char)i+" : "+c[i]);
        }
    }

    System.out.println();

    for(int i=0;i<c.length;i++){
        if(c[i]>0){

            if(c[i]>1){
                continue;

            }
            System.out.print((char)i);
        }
    }

    }
}
