public class BubbleSort
{
    public static void main(String[] args) {

        int[] inArray = {20, 35, -15, 7, 55, 1, -22};

        for (int i = inArray.length - 1; i > 0; i--) {
            for(int j = 0; j < i; j++)
            {
                if(inArray[j] > inArray[j + 1])
                {
                    swap(inArray, j, j + 1);
                }
            }

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