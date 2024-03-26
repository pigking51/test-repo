package Java240326re;


import java.util.Arrays;

public class InsertionSortExample {
    public static void main(String[] args) {
        int[] arr = {9,14,3,2,43,11,58,22};
        for (int j = 1; j <arr.length; j++) {
            int key = arr[j];
            int i = j-1;
            while ( (i > -1) && ( arr [i] > key ) ) {
                arr [i+1] = arr [i];
                i--;
            }
            arr[i+1] = key;
        }
        System.out.println(Arrays.toString(arr));

    }

}
