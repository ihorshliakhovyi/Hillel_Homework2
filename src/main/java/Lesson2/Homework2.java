package Lesson2;

public class Homework2 {
    public static void main(String[] args) {
        int [] numberArray = new int[]{1,5,6,8,9,13,11,255,36,70,-28,111, 165, 54, 75,33,18, 12, 6, 4};
        for(int i=0; i < numberArray.length; i++){
//            All positives even numbers
            if(numberArray[i]%2==0 && numberArray[i]>=0){
                System.out.print(numberArray[i] + " ");
            }
        }
        int summ = 0;
        for (int i=0; i < numberArray.length; i++){
            if(numberArray[i]>5 && numberArray[i]<45){
                summ += numberArray[i];
            }
        }
        System.out.println("\nSumm of numbers above 5 and below 45: "+summ);
    }
}
