package com.telus.Basicprograms;

public class CheckRightTriangleValidity {
    public static void main(String[] args) {
        int A = 60;
        int B = 30;
        int C = 90;
        
        if (isRightTriangleValid(A, B, C)) {
            System.out.println("It is a valid Right Triangle");
        } else {
            System.out.println("It is not a valid Right Triangle");
        }
    }

    public static boolean isRightTriangleValid(int A, int B, int C) {
        // Check if one of the angles is 90 degrees and if the Pythagorean theorem holds
        return (A == 90 && B + C == 90) || (B == 90 && A + C == 90) || (C == 90 && A + B == 90);
    }
}

