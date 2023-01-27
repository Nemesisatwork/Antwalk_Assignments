package org;

public class SampleExeption {
    public static void main(String[] args) {
        try {
            int x = 10;
            int y = 2;
            int z = x / y;
            System.out.println(z);
            int[] num = new int[5];
            num[5] = 100;
        } catch (ArithmeticException e) {
            System.out.println("Something went wrong");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound");
        }
    }
}
