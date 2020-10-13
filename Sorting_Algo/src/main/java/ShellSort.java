public class ShellSort {

    public static void main(String[] args) {

        int[] inArray = {20, 35, -15, 73, 55, 1, -22};

        for (int gap = inArray.length / 2; gap >0 ; gap /=2) {

            for (int i = gap; i < inArray.length; i++) {
                int newElement = inArray[i];

                int j = i;

                while(j >= gap && inArray[j - gap] > newElement){

                    inArray[j] = inArray[j - gap];
                    j -=gap;
                }

                inArray[j] = newElement;
            }
        }

        for (int element:inArray) {
            System.out.print(element + " ");
        }
    }
}
