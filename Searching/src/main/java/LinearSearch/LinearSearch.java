package LinearSearch;

public class LinearSearch {

    public static void main(String[] args) {
        int[] inArray = { 20, 35, -15, 7, 55, 1, -22};
        int key = -15;
        int index = linearSearch(inArray, key);
        System.out.println(index);
    }

    private static int linearSearch(int[] inArray, int key) {

        for (int i = 0; i < inArray.length; i++) {
            if (inArray[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
