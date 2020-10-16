import java.util.Arrays;

public class SortingArrays {

    public static void main(String[] args) {

        int[] inArray = { 20, 35, -15, 7, 55, 1, -22};

        //Arrays.sort(inArray);
        Arrays.parallelSort(inArray);

        for (int element:inArray) {
            System.out.print(element+" ");
        }
    }
}
