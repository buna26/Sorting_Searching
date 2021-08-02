public class BubbleSort {
    static int noOfSwaps = 0;
    static int noOfPasses = 0;
    public static void sort(int[] arr) {
        int n = arr.length-1;
        for (int i = 0; i < n; i++) {
            boolean swapped = false;
            noOfPasses += 1;
            for (int j = 0; j < (n - i); j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    noOfSwaps += 1;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,60,35,2,45,320,5};
        sort(arr);
        System.out.println("Sorted array:");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println("\nNo. of passes: " + noOfPasses + "\nNo. of swaps: " + noOfSwaps);
    }
}
