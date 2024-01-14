package com.yasar.lesson006;

import java.util.Arrays;

public class MultiArrayTest {
    public static void main(String[] args) {


        int[][] ints = new int[2][3];
        ints[0][0] = 5;
        ints[0][1] = 15;
        ints[0][2] = 52;
        ints[1][0] = 25;
        ints[1][1] = -15;
        ints[1][2] = 512;

        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.print(ints[i][j]+"  ");
            }
            System.out.println();
        }
    }


}
