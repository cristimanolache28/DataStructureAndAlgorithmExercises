package love2code.exercises.shiftVectorElements;

import java.util.List;

public class CircularShift {

    public static void main(String[] args) {
        int[] vector = {1, 2, 3, 4, 5};
        int positionsToShift = 2;

        int[] shiftedVector = circularShift(vector, positionsToShift);

        System.out.print("Original Vector: ");
        printVector(vector);

        System.out.print("Shifted Vector: ");
        printVector(shiftedVector);
    }

    public static int[] circularShift(int[] vector, int positions) {
        int length = vector.length;
        int[] shiftedVector = new int[length];

        // Adjust positions if it's greater than the vector length
        positions = positions % length;

        // Shifting elements
        for (int i = 0; i < length; i++) {
            int shiftedIndex = (i + positions) % length;
            shiftedVector[shiftedIndex] = vector[i];
        }

        return shiftedVector;
    }

    public static void printVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
}
