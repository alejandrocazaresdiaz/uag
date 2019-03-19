//package com.alexCazares;

/**
 *
 * @author Alejandro Cazares
 */
public class Compute2 {

    public static void main(String[] args) {
        float subtotal = 0;
        for (int k = 1; k < Math.pow(10, 6); k++) {
            double one = Math.pow(-1, k + 1);
            subtotal += (one / (double)(2 * k - 1));
//            System.out.print(one<0?(int)one+"/"+(2*k-1):"+"+(int)one+"/"+(2*k-1));
        }
        System.out.println(4 * subtotal);
    }
}
