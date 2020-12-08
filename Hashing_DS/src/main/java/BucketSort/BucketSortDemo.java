//Bucket Sort Implementation uses the Hashing
package BucketSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSortDemo {

    public static void main(String[] args) {
        int[] inArray = { 54, 46, 83, 66, 95, 92, 43};

        bucketSort(inArray);

        for (int i = 0; i < inArray.length; i++) {
            System.out.println(inArray[i]);
        }
    }

    private static void bucketSort(int[] input) {
        List<Integer>[] buckets = new List[10];

        for (int i = 0; i < buckets.length; i++) {
            //using linked list for the buckets
            //buckets[i] = new LinkedList<Integer>();
            //using Array List for the buckets
            buckets[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < input.length; i++) {
            buckets[hash(input[i])].add(input[i]);
        }

        for (List bucket : buckets) {
            Collections.sort(bucket);
        }

        int j = 0;
        for (int i = 0; i < buckets.length; i++) {
            for (int value : buckets[i]) {
                input[j++] = value;
            }
        }
    }

    private static int hash(int value)
    {
        return value / (int) 10;
    }
}
