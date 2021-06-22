import java.util.Scanner;

public class BinarySearch {
    public static int search(int[] arr, int elementToBeSearched){
        int h = arr.length-1;
        int l = 0;
        int m;
        while (l <= h){
            m = (l+h)/2;
            if(arr[m]==elementToBeSearched){
                return m;
            }
            if(arr[m]>elementToBeSearched){
                h = m-1;
            }
            else {
                l = m+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int elementToBeSearched = sc.nextInt();

        int ans = search(arr, elementToBeSearched);
        if(ans == -1){
            System.out.println("Element is not present in the array");
        }
        else {
            System.out.println("Element found at position : " + ans);
        }
    }
}
