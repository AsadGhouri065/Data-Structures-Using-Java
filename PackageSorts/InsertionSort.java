package PackageSorts;

public class InsertionSort {
    public static void sort (int[] arr) {
        // 6, 5, 3, 1, 8, 7, 2, 4
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i;

            while (j > 0 && arr[j-1] > key) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = key;
        }
    }

    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

}
