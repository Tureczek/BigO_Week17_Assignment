public class BinarySearch {
    static int binarySearch(int[] arr, int number) { //Søger efter specifik talværdi på soteret liste
        //1. Halver arrayet
        //2. Spørg om det midterste er = number
        //3. hvis ja, retuner
        //4. Hvis nej, så søg videre i den relevante halvdel
        //5. gå til 1

        //Array = 3, 7, 9, 11, 15, 22, 43, 71

        int start = 0;
        int mid = 0;
        int end = arr.length - 1;

        while (start <= end) {  // Tidskompleksitet: O(log(N)
            mid = (start + end) / 2; // Her ligger skatten gemt: HALVERING
            if (number < arr[mid]) { // er 9 mindre end 11? number kan være til vendtre i arrayet
                end = mid - 1;
            } else if (arr[mid] == number) {
                System.out.println("Found the number on " + arr[mid]);
                return arr[mid]; //Vi fandt objektet
            } else {
                start = mid + 1; // number kan være til "højre" i arrayet
            }
        }
        return -1;
    }

}

