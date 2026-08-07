import java.util.*;
import java.util.stream.*;

public class concat_array {
    public static void sorting(int[] arr){
        ArrayList<Integer> sort = new ArrayList<>();
        for(Integer a: arr){
            sort.add(a);
        }
        System.out.println("The original array: " + sort);
        Collections.sort(sort);
        System.out.println("The array in ascending order: " + sort);

        Collections.reverse(sort);
        System.out.println("The array in descending order: " + sort);

        System.out.println("The maximum value in the array: " + Collections.max(sort));

        System.out.println("The minimum value in the array: " + Collections.min(sort));
        
    }

    public static void treesort(int[] arr3){
        TreeSet<Integer> treeSet = new TreeSet<>();

        for(Integer a: arr3){
            treeSet.add(a);
        }

        System.out.println("The array without duplicates and sorted: " + treeSet);
    }


    public static void main(String[] args) {
        int[] arr1 = {1,2,3,7,8,9,4,5,6,0,5};
        int[] arr2 = {4,5,6,0,5,8,9,7,1,2,3};

        int[] arr3=IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).toArray();

        System.out.println(Arrays.toString(arr3));
        sorting(arr3);
        treesort(arr3);
    }
}