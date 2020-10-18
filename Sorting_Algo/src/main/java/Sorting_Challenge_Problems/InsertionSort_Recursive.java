package Sorting_Challenge_Problems;

public class InsertionSort_Recursive {

    public static void main(String[] args) {

        int[] inArray = {20, 35, -15, 70, 55, 1, -22};

        insertionSortRec(inArray, inArray.length);

        for (int element:inArray) {
            System.out.print(element + " ");
        }
    }

    public static void insertionSortRec(int[] input, int numItem)
    {
        if ( numItem < 2)
            return;

        insertionSortRec(input, numItem - 1);

        int newElement = input[numItem - 1];

        int i;

        for (i = numItem - 1; i > 0 && input[i - 1] > newElement ; i--) {
            input[i] = input[i - 1];
        }

        input[i] = newElement;
    }

}



