package org;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class SampleMultiCatch {
    public static void main(String[] args) {
        try {
            int x = 10;
            int y = 2;
            int z = x / y;
            System.out.println(z);
            int[] num = new int[5];
            num[5] = 100;

            // compile time exception
            FileReader fr = new FileReader("my.text");

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | FileNotFoundException e) {
            System.out.println(e.getMessage());
            if (e instanceof ArithmeticException)
                System.out.println("/ by zero");
            else if (e instanceof ArrayIndexOutOfBoundsException)
                System.out.println("array index out of bound");
            else if (e instanceof FileNotFoundException)
                System.out.println("File not found");
            else
                System.out.println("Something went wrong");
        }
    }
}
