import java.util.*;

public class String_Arr {
    public static void arr_sort(String[] arr){
        String temp;
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }


    }


    public static void main(String[] args) {
        String[] arr = {"elderberry", "banana", "cherry", "date", "apple"};
        arr_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}