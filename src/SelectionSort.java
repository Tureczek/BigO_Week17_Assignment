import java.util.Arrays;

public class SelectionSort {
    //Selection list sorting
    static int[] selectionSort(int[] arr) {
        //1. loop gennem arrayet for at finde det mindste tal først
        //2. loob for at finde det næste tal i rækken
        //3. Fortsæt, indtil alle tal er på plads.

        int icount = 0;
        int jcount = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int iMin = i;
            icount++;
            System.out.println("antal iterationer i første loop: " + icount + " : on index: " + i + " : " + Arrays.toString(arr)); // hvad får vi efter en kørsel
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[iMin])
                    iMin = j;
                jcount++;
                System.out.println("antal iterationer i andet loop: " + jcount + " : on index: " + j + " : " + Arrays.toString(arr)); // hvad får vi efter en kørsel
            }
            int temp = arr[iMin];
            arr[iMin] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Loop i kørte: " + icount + " Gange\n" + "Loop j kørte: " + jcount + " gange\n" + Arrays.toString(arr));
        return null;
    }
}
