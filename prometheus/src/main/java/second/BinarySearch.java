package main.java.second;

public class BinarySearch {

    public static void main(String[] args) {

        int data[] = { 3, 6, 7, 10, 34, 56, 60 };
        int x = 10;
        int l = 0, r = data.length - 1;
        int m = -1;
        while (l <= r) {
            m = l + (r - l) / 2;
            // Check if x is present at mid
            if (data[m] == x)
                break;
            // If x greater, ignore left half
            if (data[m] < x)
                l = m + 1;
                // If x is smaller, ignore right half
            else
                r = m - 1;
        }
        System.out.println(m);
    }
}