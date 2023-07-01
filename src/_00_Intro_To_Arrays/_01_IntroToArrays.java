package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
        String[] arr = new String[]{"one","two","three","four","five"};
        // 2. print the third element in the array
        System.out.println(arr[3]);
        // 3. set the third element to a different value
        arr[3]="value";
        // 4. print the third element again
        System.out.println(arr[3]);        
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
        for(int i =0;i<arr.length;i++){
            arr[i] = "newVal";
        }
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
        for(int j = 0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
        // 7. make an array of 50 integers
        
        // 8. use a for loop to make every value of the integer array a random
        //    number

        // 9. without printing the entire array, print only the smallest number
        //    on the array

        // 10 print the entire array to see if step 8 was correct

        // 11. print the largest number in the array.

        // 12. print only the last element in the array

    }
}
