package main.java.second;

public class ShellSort {

    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;
        int n;
        int j;
        for (int gap = length/2; gap > 0; gap /= 2) {
            for (int i = gap; i < length; i += 1) {
                n = array[i];
                for (j = i; j >= gap && array[j - gap] > n; j -= gap)
                    array[j] = array[j - gap];
                array[j] = n;
            }
        }
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
        // PUT YOUR CODE HERE

    }
}
