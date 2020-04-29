import java.util.Arrays;

public class BubbleSort {

    static int[] bubbleSort(int[] arr) { // N er arrayets længde
        //1. Sammenlign de to første
        //2. Hvis tallet til højre er mindre, så byt
        //3. Ellers gå videre til næste position
        //4. Fortsæt indtil der ikke blev fortaget nogen byt
        int count = 0;
        boolean byt = true;
        while (byt) { // Hvor mange gange? N
            byt = false;
            for (int i = 0; i < arr.length - 1; i++) { //Hvor mange gange køre løkken? N-1
                if (arr[i + 1] < arr[i]) { // Hvis true, så byt
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    byt = true;
                }
                count++; // hvor mange gange køre denne? (udtrykt med N)  N(i While løkken)*N(for løkken)-1
                System.out.println("antal iterationer: " + count + " : " + Arrays.toString(arr)); // hvad får vi efter en kørsel
            }
        }
        return null;
    }

}
