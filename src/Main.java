import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{32, 7, 49, 11, 15, 22, 3, 71, 1, 27, 20, 2};
        int[] sortArray = new int[]{1, 7, 16, 22, 30, 80, 108, 600, 601, 5001};

        BubbleSort bs = new BubbleSort();
        //bs.bubbleSort(array);

        BinarySearch binarySearch = new BinarySearch();
        //binarySearch.binarySearch(sortArray, 108);

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort(array);

        int placeholder;

    }

    //Metode der løber gennem et array
    static int search(int[] arr, int number) {
        int temp;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) { // runtime complexity på O(N)
                return number;
            }
        }

        return -1;
    }




}
