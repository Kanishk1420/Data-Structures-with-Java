public class Rotation {
    public static void rotate(int array[], int pivot) {
        for (int i = pivot; i <= array.length - 1; i++) {
            System.err.print(array[i] + " ");
        }
        for (int i = 0; i < pivot; i++) {
            System.err.print(array[i] + " ");
        }
    }

    public static int pivotsearching(int array[], int pivot) {
        boolean pivotExists = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == pivot) {
                pivotExists = true;
                break;
            }
        }

        if (!pivotExists) {
            System.err.println("Element " + pivot + " not found in the array");
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= pivot) {
                System.out.print(array[i] + " ");
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < pivot) {
                System.out.print(array[i] + " ");
            }
        }
        return pivot;
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 6, 7 };
        rotate(array, 4);
        System.err.println("\n");
        pivotsearching(array, 5);
    }
}
