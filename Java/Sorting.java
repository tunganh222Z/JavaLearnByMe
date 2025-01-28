public class Sorting {
    public static void main(String[] args) {
        int[] a = {5, 3, 2, 7, 8, 1, 2};



        System.out.println("\n" +"----------------- Insertion sort ----------------");

        selectionSort(a);



    }

    public static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }

            printArray(a);
        }
    }

    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++){
            int ai = a[i];
            int j = i-1;

            while (j >= 0 && a[j] > ai){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = ai;

            printArray(a);
        }
    }

    public static void selectionSort (int[] a){
        for (int i=0 ; i < a.length-1; i++){
            int minIndex = i;

            for (int j = i+1; j < a.length; j++){
                if (a[minIndex] > a[j]){
                    minIndex = j;
                }
            }

            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
            printArray(a);
        }
    }

    public static void printArray (int[] a){
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k]+" ");
        }
        System.out.println();
    }
}
