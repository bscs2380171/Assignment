public class binarySearchIterative {
    public static class SearchOperations {

        // ===== Iterative Binary Search =====
        public int binarySearchIterative(int[] arr, int key) {
            int left = 0, right = arr.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[mid] == key) return mid;
                else if (arr[mid] < key) left = mid + 1;
                else right = mid - 1;
            }
            return -1; // not found
        }

        // ===== Recursive Binary Search =====
        public int binarySearchRecursive(int[] arr, int key, int left, int right) {
            if (left > right) return -1;
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) return mid;
            else if (arr[mid] < key) return binarySearchRecursive(arr, key, mid + 1, right);
            else return binarySearchRecursive(arr, key, left, mid - 1);
        }

        // ===== Recursive Linear Search =====
        public int recursiveLinearSearch(int[] arr, int key, int index) {
            if (index >= arr.length) return -1;
            if (arr[index] == key) return index;
            return recursiveLinearSearch(arr, key, index + 1);
        }

        // ===== Recursive Minimum =====
        public int findMin(int[] arr, int index) {
            if (index == arr.length - 1) return arr[index];
            int minRest = findMin(arr, index + 1);
            return (arr[index] < minRest) ? arr[index] : minRest;
        }

        // ===== Recursive Maximum =====
        public int findMax(int[] arr, int index) {
            if (index == arr.length - 1) return arr[index];
            int maxRest = findMax(arr, index + 1);
            return (arr[index] > maxRest) ? arr[index] : maxRest;
        }
    }



}
