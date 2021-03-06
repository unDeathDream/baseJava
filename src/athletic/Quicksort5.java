package athletic;

public class Quicksort5 {


    private Quicksort5(){}

    private static void sort(Comparable [] arr) {

        int n = arr.length;
        sort(arr,0,n-1);

    }

    private static void sort(Comparable[] arr, int l, int r) {

        if (l >r)
            return;

        int p = portation(arr,l,r);

        sort(arr,l,p-1);
        sort(arr,p+1,r);




    }


    private static int portation(Comparable [] arr,int l,int r){

        Comparable v = arr[l];

        int j = l;

        for (int i = l+1; i <= r; i++){

            if (v.compareTo(arr[i]) > 0){

                j++;
                swap(arr,i,j);
            }

        }

        swap(arr,l,j);

        return j;

    }

    private static void swap(Object[] arr, int i, int j) {

        Object t = arr[i];
        arr[i]  = arr[j];
        arr[j] = t;

    }


}
