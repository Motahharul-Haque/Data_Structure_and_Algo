public class QuickSort {

    public static void main(String[] args) {

        int[] inArray = { 20, 35, -15, 75, 55, 1, -22};

        quickSort(inArray, 0, inArray.length);

        for (int element : inArray) {
            System.out.println(element);
        }
    }

    public static void quickSort(int[] input, int start, int end)
    {
        if (end - start < 2)
        {
            return;
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    private static int partition(int[] input, int start, int end) {
        //This is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j){

            //Empty loop body
            while (i <j && input[--j] >= pivot);

            if(i < j)
            {
                input[i] = input[j];
            }

            //Empty loop body
            while (i < j && input[++i] <= pivot);

            if(i < j)
            {
                input[j] = input[i];
            }
        }

        input[j] = pivot;
        return j;
    }
}
