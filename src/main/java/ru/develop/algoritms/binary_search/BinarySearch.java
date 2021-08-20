package ru.develop.algoritms.binary_search;

import java.util.Arrays;

/**
 * Реализация бинарного поиска
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[]{0,1,2,34,56,78,90,109};
        Arrays.sort(array);
        int index = search(array, 109);
        if(index != -1){
            System.out.println("RESULT VALUE : " + array[index]);
            System.out.println("RESULT INDEX : " + index);
        }
    }
    public static int search(int[] array_sort, int element){
        System.out.println("INPUT ARRAY SORT : " + Arrays.toString(array_sort));
        //Ищем 109
        System.out.println("SEARCH VALUE : " + element);
        int min = 0;
        int max = array_sort.length - 1;

        while(min <= max){
            System.out.println("MIN : " + min);
            System.out.println("MAX : " + max);
            //Шаг 1. (0 + 7) / 2 = 3
            //Шаг 5. (4 + 7) / 2 = 5
            //Шаг 9. (6 + 7) / 2 = 6
            //Шаг 13. (7 + 7) / 2 = 7
            int mid = (min + max) / 2;
            System.out.println("ARRAY INDEX : " + mid);
            //array_sort[3] = 34
            //array_sort[5] = 78
            //array_sort[6] = 90
            //array_sort[7] = 109
            System.out.println("VALUE ARRAY[MID] : " + array_sort[mid]);
            //Шаг 2. 34 == 109 | false
            //Шаг 6. 78 == 109 | false
            //Шаг 10. 90 == 109 | false
            //Шаг 14. 109 == 109 | true
            if(array_sort[mid] == element){
                //Шаг 15. Вернуть индекс 7
                return mid;
            }
            //Шаг 3. 34 < 109 | true
            //Шаг 7. 78 < 109 | true
            //Шаг 11. 90 < 109 | true
            else if(array_sort[mid] < element){
                //Шаг 4. 3 + 1 = 4
                //Шаг 8. 5 + 1 = 6
                //Шаг 12. 6 + 1 = 7
                min = mid + 1;
            }
            else{
                max = mid - 1;
            }
        }
        return -1;
    }
}
