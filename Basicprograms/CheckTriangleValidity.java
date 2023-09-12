package com.telus.Basicprograms;

public class CheckTriangleValidity {
    public static void main(String[] args) {
        int A = 70;
        int B = 30;
        int C = 80;
        
        if (isTriangleValid(A, B, C)) {
            System.out.println("It is a valid triangle");
        } else {
            System.out.println("It is not a valid triangle");
        }
    }

    public static boolean isTriangleValid(int A, int B, int C) {
        // Check if the sum of angles is equal to 180 degrees
        return A + B + C == 180;
    }
}

