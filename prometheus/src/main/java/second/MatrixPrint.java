package main.java.second;

public class MatrixPrint {
    public static void main(String args[]){
//PUT YOUR CODE HERE
        int [][] anArray = new int [5][5];
        int a = 1;
        for (int i = 0; i < anArray.length; i++) {
            for (int j = 0; j < anArray.length; j++) {
                if ((i ==j) | (i + j == anArray.length - 1))
                    System.out.print(" * ");
                else if (a<10){
                    System.out.print (" " + a + " ");
                }
                else {
                    System.out.print (a + " ");
                }
                a = a+1;
            }
            System.out.println();
        }
//PUT YOUR CODE HERE
    }
}
