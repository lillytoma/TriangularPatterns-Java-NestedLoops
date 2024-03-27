import java.lang.System;
import java.util.Scanner;

public class TriangularPatterns {
    public static void main(String[] args) {
        System.out.println("A:");
        for(int j = 1; j < 7; j++) { //outer //prints out the iteration 1-10; ten times.
            for (int i = 1; i < j + 1; i++) { //inner
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println("B:");
        for(int i=6; i>0; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("C:");
        for(int i = 1; i <= 6; i++) {
            for (int s = 6; s >= 1; s--) {
                if (s <= i)
                    System.out.print(s);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println(" ");

        System.out.println("D:");
        for(int i = 6; i >= 1; i--){
            for(int s = 6; s >= 1 + i; s--) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
