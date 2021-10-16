package com.company.calcium_collision;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int [] test = {2,5,3,-1,5,-10,0};
        System.out.print(Arrays.toString(removeNegativeNumbers(test)));

    }

    public static int[] removeNegativeNumbers(int[] arrray){

        // Start size new array size as previous array size
        int newArraySize = arrray.length;

        // Loop to define new array size
        for (int num: arrray){
            if (num < 0) newArraySize--;
        }

        // Initialize new array with our defined size
        int[] newArray = new int[newArraySize];

        // Fill new array with correct values
        for (int a = 0, k = 0; a < arrray.length; a++){

            if (arrray[a] >= 0){
                newArray[k] = arrray[a];
                k++;
            }
        }
        return newArray;

    }
}
