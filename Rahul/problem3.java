import java.util.Scanner;

/**
 * problem3
 */
public class problem3 {

    public boolean canPlaceFlower(int[] flowerbed, int n) {
        int max = 0;

        int fi = -1; // first 1's index after 0's
        int li = -1; // last 1's index before 0's

        for (int i = 0; i < flowerbed.length; i++) { // corrected loop condition
            if (flowerbed[i] == 0) {
                continue;
            } else if (fi == -1) { // if found first index 1
                fi = i; // first index
                li = i; // last index
            } else { // now we have first 1th index now move li to find last 1th index
                li = i;
            } // now we have first and last 1th index
        }

        // for all zeros in array
        if (fi == -1) {
            max = (flowerbed.length + 1) / 2; // if all zeros then..
        } else { // if we found 1 first index of 1
            int left = fi;
            int right = flowerbed.length - 1 - li; // corrected calculation of right

            max = left / 2;
            max += right / 2;

            int count = 0;
            for (int i = fi + 1; i < li; i++) { // corrected loop condition
                if (flowerbed[i] == 0) { // when we are finding 0s then counting going on
                    count++;
                } else { // we found 1
                    max += (count - 1) / 2;
                    count = 0;
                }
            }
            max += (count - 1) / 2;
        }

        return n <= max;
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the flowerbed: ");
        int size = scanner.nextInt();
        int[] flowerbed = new int[size];

        System.out.println("Enter the elements of the flowerbed (0 or 1): ");
        for (int i = 0; i < size; i++) {
            flowerbed[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of flowers to place: ");
        int n = scanner.nextInt();

        problem3 obj = new problem3();
        boolean result = obj.canPlaceFlower(flowerbed, n);

        System.out.println("Can place flowers: " + result);
    }
}
