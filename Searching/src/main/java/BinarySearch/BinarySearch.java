package BinarySearch;

public class BinarySearch {

    public static void main(String[] args) {
        int[] inArray = { -22, -15, 1, 7, 20, 35, 55};
        int key = 1;
        System.out.println(binarySearch(inArray, key));
        int start = 0;
        int end = inArray.length;
        int key1 = 35;
        System.out.println(recursiveBinarySearch(inArray, start, end, key1));
    }

    private static int binarySearch(int[] inArray, int key) {
        int start = 0;
        int end = inArray.length;

        while (start < end)
        {
            int mid = start + (end - start)/2;
            System.out.println("MidPoint "+mid);

            if (inArray[mid] == key) {
                return mid;
            }
            else if(inArray[mid] < key)
            {
                start = mid + 1;
            }
            else
            {
                end = mid;
            }
        }
        return -1;
    }

    private static int recursiveBinarySearch(int[] inArray, int start, int end, int key)
    {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start)/2;
        System.out.println("MidPoint "+mid);

        if (inArray[mid] == key) {
            return mid;
        }
        else if(inArray[mid] < key)
        {
            return recursiveBinarySearch(inArray, mid + 1, end, key);
        }
        else
        {
            return recursiveBinarySearch(inArray, start, mid, key);
        }
    }
}
