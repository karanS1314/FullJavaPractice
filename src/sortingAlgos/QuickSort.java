package sortingAlgos;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {10, 80, 30, 90, 40, 50, 70};

        quickSort(arr , 0 , arr.length - 1);

        for(int e : arr){
            System.out.print(e + " ");
        }
        System.out.println();
    }

    static void quickSort(int arr[] , int lo , int hi){

        if(lo > hi){
            return;
        }

        int pivot = arr[hi];

        int pi = partition(arr , pivot , lo , hi);
        
        quickSort(arr, lo, pi - 1);
        quickSort(arr, pi + 1, hi);
    }
    static int partition(int arr[] , int pivot , int lo , int hi){
        int i = lo;
        int j = lo;
        while(i <= hi){
            if(arr[i] <= pivot){
                swap(arr , i , j);
                i++;
                j++;
            }
            else{
                i++;
            }
        }

        return j - 1;
    }
    static void swap(int a[] , int i , int j){
        int x = a[i];
        int y = a[j];
        a[j] = x;
        a[i] = y;
    }
}
