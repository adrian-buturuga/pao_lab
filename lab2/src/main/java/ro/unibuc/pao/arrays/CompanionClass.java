package ro.unibuc.pao.arrays;

import java.util.Arrays;

public class CompanionClass {

    public static void main(String[] args) {
        int[] a = {1, 6, 3, 9, 2, 3};
        int[] b = new int[50];
        Integer[] c = new Integer[20];

        // Fill array with a specific value
        Arrays.fill(b, 7);

        // Sort an array
        Arrays.sort(a);

        // Find the position of an element in the array
        int position = Arrays.binarySearch(a, 6);
        System.out.println("Value was found at index "+position);

        // Create a copy the array with a custom size
        b = Arrays.copyOf(a, a.length);

        // Displaying array contents
        // Option 1
        System.out.println(c);
        // Option 2
        for (int i=0; i<c.length; i++) {
            System.out.print(c[i]+" ");
        }
        System.out.println();
        // Option 3
        System.out.println(Arrays.deepToString(c));

    }

}
