import java.util.*;


public class Pattern_printing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Pattern: Right Half Pyramid");
        for(int i = 1; i <= number; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Pattern: left Half Pyramid");
        for(int i = 1; i <= number; i++) {
            for(int k = number; k > i; k--) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Pattern: Triangle star Pyramid");
        for(int i = 1; i <= number; i++) {
            for(int k = i; k <=number; k++) {
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Pattern: Reverse left star half Pyramid");
        for(int i = 1; i <= number; i++) {
            for(int k = 1; k <=i; k++) {
                System.out.print("  ");
            }
            for(int j = i; j <= number; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
         System.out.println("Pattern: Reverse Right star half Pyramid");
        for(int i = 1; i <= number; i++) {
            // for(int k = 1; k <=i; k++) {
            //     System.out.print("  ");
            // }
            for(int j = i; j <= number; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}