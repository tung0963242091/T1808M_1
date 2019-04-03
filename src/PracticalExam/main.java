package PracticalExam;

import java.util.Scanner;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        float[][] s = new float[3][2];
        Scanner s1 = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            System.out.println("Enter marks of storinghotel : " + (i + 1));
            for (int j = 0; j < 2; j++) {
                System.out.println("storinghotel : " + (j + 1));
                s[i][j] = s1.nextFloat();
            }

        }

        for (int i = 0; i < 3; i++) {

            System.out.println("storinghotel" + (i + 1));

            for (int j = 0; j < 2; j++) {
                System.out.println("storinghotel" + (j + 1) + ":" + s[i][j]);
            }
        }
    }
}
