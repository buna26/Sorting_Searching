public class MergeSort {
    static void merge(int[] arr,int left,int right,int mid){
        int size1 = mid-left+1;
        int size2 = right-mid;
        int[] L = new int[size1];
        int[] R = new int[size2];
        for(int i=0; i<L.length; i++){
            L[i] = arr[left+i];
        }
        for(int i=0; i<R.length; i++){
            R[i] = arr[mid+1+i];
        }
        int i=0,j=0,k=left;
        while(i<size1 && j<size2){
            if(L[i] <= R[j]) {
                arr[k]=L[i];
                i++;
            }
            else{
                arr[k]=R[j];
                j++;
            }
            k++;
        }
        while(i<size1){
            arr[k]=L[i];
            i++;
            k++;
        }
        while(j<size2){
            arr[k]=R[j];
            j++;
            k++;
        }
    }
    static void mergeSort(int[] arr, int left,int right){
        if(left<right){
            int mid = (right+left)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,right,mid);
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,15,18,12,20};
        mergeSort(arr, 0,arr.length-1);
        for (int val : arr) {
            System.out.println(val);
        }
    }
}