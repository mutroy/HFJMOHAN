package org.uppaluri.HFJCH1;

public class BeTheCompiler_Exercise1a {
    public static void main(String[] args) {
        int x = 1;
        while (x < 10) {
            if (x > 3) {
                System.out.println("big x");
            }
            // Below is the solution of adding line for it to work
            x = x + 1;
        }
    }
}
