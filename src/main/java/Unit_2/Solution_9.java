package Unit_2;

import java.util.Arrays;
//"сортировка слиянием"
public class Solution_9 {
    public static int[] mergeArrays(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];
        int poz1 = 0;
        int poz2 = 0;
        for(int i = 0; i<array3.length; i++) {
            if (poz1 > array1.length - 1) {
                array3[i] = array2[poz2];
                poz2++;
            } else if (poz2 > array2.length - 1) {
                array3[i] = array1[poz1];
                poz1++;
            } else if (array1[poz1] < array2[poz2]) {
                array3[i] = array1[poz1];
                poz1++;
            } else {
                array3[i] = array2[poz2];
                poz2++;
            }
        }

            return array3;
        }

        public static void main(String[] args) {
            int[] array1 = {0,2,2};
            int[] array2 = {1,3};
            Arrays.sort(array1);
            Arrays.sort(array2);
            System.out.println(Arrays.toString(mergeArrays(array1,array2)));

        }
}
