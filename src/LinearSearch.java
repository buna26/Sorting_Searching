import java.util.Scanner;

public class LinearSearch {
    public static int search(int[] arr, int elementToBeSearched){
        for (int i = 0; i < arr.length; i++){
            if(arr[i]==elementToBeSearched){
                return i;
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

        int index = search(arr,elementToBeSearched);
        if (index == -1)
            System.out.println("Element is not present in the array!");
        else
            System.out.println("Element is found at index "+ index+"!");
    }
}
//the worst case time complexity for Linear search is O(n).
