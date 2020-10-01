
package mergesort;

public class MergeSort {

    public static void Merge(int[] L, int[] R, int[] A){
        int nl = L.length;
        int nr = R.length;
        int i, j, k;
        i = j = k = 0;
        while(i < nl && j < nr)
        {
            if(L[i] <= R[j]){
                A[k] = L[i];
                i++;
            }
            else{
                A[k] = R[j];
                j++;
            }
            k++;
        }
        while(i < nl)
        {
            A[k] = L[i];
            i++;
            k++;
        }
        while(j < nr)
        {
            A[k] = R[j];
            j++;
            k++;
        }
    }
    
    
    public static void MergeSort(int[] A){
        int n = A.length;
        if(n < 2)
            return;
        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n-mid];
        int i = 0;
        for(i = 0; i < mid; i++)
        {
            left[i] = A[i];
        }
        for(i = mid; i < n; i++)
        {
            right[i-mid] = A[i];
        }
        MergeSort(left);
        MergeSort(right);
        Merge(left, right, A);        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {15,48,100,0,6,1,15,1,4,5};
        System.out.println("Array before Merge Sort:");
        for(int i = 0;i < arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        MergeSort(arr);
        System.out.println("\nArray after Merge Sort:");
        for(int i = 0;i < arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }        
    }
    
}
