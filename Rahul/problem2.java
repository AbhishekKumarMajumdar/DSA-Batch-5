// package Rahul;

import java.util.ArrayList;
import java.util.Scanner;

public class problem2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();  // n denoting no. of rows
        int q = scanner.nextInt();  // q denoting no. of quiries

        ArrayList<ArrayList<Integer>> variableLengthArrays = new ArrayList<>();

        //two lines of space-separated integers for variable length arrays
        for (int i = 0; i < n; i++) { // n = 2 => to 2 line(row) lega k ke liye
            int k = scanner.nextInt();
            ArrayList<Integer> array = new ArrayList<>();
            for (int j = 0; j < k; j++) { // it will count sub-array of given n => start with 0+1 (end with k-1)
                array.add(scanner.nextInt());
            }
            variableLengthArrays.add(array); // first jitna likhenge utne number type karne hai
        }

        int[][] fixedLengthArrays = new int[q][2]; // given q will count till < 2

        System.out.println("Enter " + q + " lines of 2 space-separated integers for fixed length arrays:");
        for (int i = 0; i < q; i++) {
            fixedLengthArrays[i][0] = scanner.nextInt(); // 0th row
            fixedLengthArrays[i][1] = scanner.nextInt(); // 1th row because we finding only for 0, 1
        }

        System.out.println("Result is:");
        for (int i = 0; i < q; i++) {
            int row = fixedLengthArrays[i][0]; // count row
            int col = fixedLengthArrays[i][1]; // coount collumn
            System.out.println(variableLengthArrays.get(row).get(col)); // o/p will be for 2 q's
        }

        return;
    }
}
