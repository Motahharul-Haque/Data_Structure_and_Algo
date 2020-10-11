public class SelectionSort
{
    public static void main(String[] args) {

        int[] inArray = {20, 35, -15, 71, 55, 1, -22};

        for (int i = inArray.length - 1; i > 0; i--) {
            int largest = 0;

            for(int j = 1; j <= i; j++)
            {
                if(inArray[j] > inArray[largest])
                {
                    largest =j;
                }
            }

            swap(inArray, largest, i);
        }

        for (int element:inArray) {
            System.out.print(element + " ");
        }
    }
    public static void swap(int[] arr, int i, int j)
    {
        if(i==j)
            return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
