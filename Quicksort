public class QuickSort {

    // Quick Sort
    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {                         // base case: array has more than 1 element
            int pi = partition(arr, low, high);   // partition the array

            quickSort(arr, low, pi - 1);         // sort left sub-array
            quickSort(arr, pi + 1, high);        // sort right sub-array
        }
    }

    // Partition function
    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];     // pivot element
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
            }
        }
        int temp = arr[i + 1]; arr[i + 1] = arr[high]; arr[high] = temp;
        return i + 1;             // pivot index
    }
}
