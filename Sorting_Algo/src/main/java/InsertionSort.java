public class InsertionSort {

    public static void main(String[] args) {

        int[] inArray = {20, 35, -15, 70, 55, 1, -22};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < inArray.length; firstUnsortedIndex++) {

            int newElement = inArray[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && inArray[i - 1] > newElement ; i--) {
                inArray[i] = inArray[i - 1];
            }

            inArray[i] = newElement;
        }
        
        for (int element:inArray) {
            System.out.print(element + " ");
        }
    }

}
