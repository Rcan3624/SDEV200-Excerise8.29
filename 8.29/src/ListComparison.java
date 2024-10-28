import java.util.Scanner;
import java.util.Arrays;
/*
The code below is based off an exercise from a book and is being modified to the program exercise instructions
 */




public class ListComparison {
    public static boolean equals(int[][] m1, int[][] m2) {

        // Check if multidimensional arrays are equal and return true if they are
        boolean identicalArrays = Arrays.deepEquals(m1, m2);

        return identicalArrays;
    }

    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Enter array values for list 1
        System.out.println("Enter list 1: ");
        String list1 = input.nextLine();
        String[] list1Array = list1.split(" ");
        int[][] array1 = new int[3][3];
        int list1ArrayIndex = 0;

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                array1[i][j] = Integer.parseInt(list1Array[list1ArrayIndex]);
                list1ArrayIndex += 1;
                //System.out.println(array1[i][j]);
            };

        // Enter array values for list 2
        System.out.println("Enter list 2: ");
        String list2 = input.nextLine();
        String[] list2Array = list2.split(" ");
        int[][] array2 = new int[3][3];
        int list2ArrayIndex = 0;

        // Convert the strings to integers
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                array2[i][j] = Integer.parseInt(list2Array[list2ArrayIndex]);
                list2ArrayIndex += 1;
                //System.out.println(array2[i][j]);
            };


        boolean identicalArrays = equals(array1, array2);

        // Display result
        if (identicalArrays) {
            System.out.println("The two arrays are identical");
        }

        else {
            System.out.println("The two arrays are not identical");
        }
    }

}