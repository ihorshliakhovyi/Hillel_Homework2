package Lesson2;

import java.util.Arrays;

public class Homework_3 {
    public static void main(String[] args) {
        int [] numberArray = new int[]{1,5,6,8,9,13,11,255,36,70,-28,111, 165, 54, 75,33,18, 12, 6, 4};
        System.out.println("The original array is: ");
        for(int i=0; i<numberArray.length; i++){
            System.out.print(numberArray[i] + " ");
        }
        Arrays.sort(numberArray);
        System.out.println("\nThe sorted array is: ");
        for(int i=0; i<numberArray.length; i++){
            System.out.print(numberArray[i] + " ");
        }
    }
}
