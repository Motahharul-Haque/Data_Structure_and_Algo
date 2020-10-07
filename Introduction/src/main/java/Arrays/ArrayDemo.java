package Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] inArray = new int[7];

        inArray[0] = 20;
        inArray[1] = 35;
        inArray[2] = -15;
        inArray[3] = 7;
        inArray[4] = 55;
        inArray[5] = 1;
        inArray[6] = -22;

        for (int i: inArray) {
            System.out.print(i+" ");
        }
    }
}
