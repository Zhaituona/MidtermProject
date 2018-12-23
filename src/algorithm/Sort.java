package algorithm;

public class Sort {

    long executionTime = 0;
    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */


    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int j = 0; j < list.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < list.length; i++) {
                if (list[i] < list[min])
                    min = i;
            }

            int temp = list[min];
            list[min] = list[j];
            list[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        //implement here
        for (int i = 1; i < list.length; i++) {
            int temp = list[i];
            int hole = i;

            while (hole > 0 && list[hole - 1] > temp) {
                list[hole] = list[hole - 1];
                hole = hole - 1;
            }
            list[hole] = temp;
        }


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int[] array) {
        int[] list = array;
        //implement here
        final long startTime = System.currentTimeMillis();
        for (int z = 0; z < list.length - 1; z++) {
            for (int a = 0; a < list.length - 1 - z; a++) {
                if (list[a] > list[a + 1]) {
                    // int temp = list[a];
                    //  list[a] = list[a + 1];
                    //  list[a + 1] = temp;
                }
                int temp = list[a];
                list[a] = list[a + 1];
                list[a + 1] = temp;
            }

        }


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    public int[] mergeSort(int[] array) {
        int[] list = array;
        //implement here
        if (list.length <= 1) {
            return list;
        }
        int midpoint = list.length / 2;
        int[] left = new int[midpoint];
        int[] right;
        if (list.length % 2 == 0) {
            right = new int[midpoint];
        } else {
            right = new int[midpoint + 1];
        }
        for (int i = 0; i < midpoint; i++) {
            left[i] = list[i];
        }
        for (int j = 0; j < right.length; j++) {
            right[j] = list[midpoint + j];
        }

        int[] result = new int[list.length];
        left = mergeSort(left);
        right = mergeSort(right);
        result = merge(left, right);
        return result;
    }



    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int leftPointer, rightPointer, resultPointer;
        leftPointer = rightPointer = resultPointer = 0;
        while (leftPointer < left.length || rightPointer < right.length) {
            if (leftPointer < left.length && rightPointer < right.length) {
                if (left[leftPointer] < right[resultPointer]) {
                    result[resultPointer++] = left[leftPointer++];
                } else {
                    result[resultPointer++] = right[resultPointer++];
                }
            } else if (leftPointer < left.length) {
                result[resultPointer++] = left[leftPointer++];
            } else if (rightPointer < right.length) {
                result[resultPointer] = right[rightPointer++];
            }
        }
        return result;

    }

    

    public int [] quickSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    
    public int [] heapSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }


    public int [] bucketSort(int [] array){
        int [] list = array;
        //implement here

        
        

        return list;
    }
    
    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
