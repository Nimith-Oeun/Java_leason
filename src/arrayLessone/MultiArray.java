package arrayLessone;

import java.util.Scanner;

public class MultiArray {
    public static void main(String[] args) {
        System.out.print("[+] Insert length of array: ");
        int n = new Scanner(System.in).nextInt();
        Integer [] numbers = new Integer[n];
        // insert each array's element
        for(int i=0;i<numbers.length;i++){
            System.out.print("[+] Insert element [" + i + "]: ");
            numbers[i] = new Scanner(System.in).nextInt();
        }
        int max = numbers[0];
        for(Integer a: numbers){
            if(max<a){
                max = a;
            }
        }
        System.out.println("This is maximum of above array: " + max);

        // 2D array

        /**
         * Create an array 2D of String that has the following
         * First row has no column
         * Second row has 3 columns
         * Third row has 1 column
         */
        String [][] names = {{},{"a","b","c"},{"d"}};
        System.out.println("Total row: " + names.length);
        System.out.println("Number of column of first row: " + names[0].length);
        System.out.println("Number of column of second row: " + names[1].length);
        System.out.println("Number of column of third row:" + names[2].length);

        //

        Character [][] colorValue =
                {
                        {'A', 'B'},
                        {'C', 'D'},
                        {'E','F','G','H'}
                };
        for(int i=0;i<colorValue.length;i++){
            for(int j=0;j<colorValue[i].length;j++){
                System.out.print(colorValue[i][j] + " | ");
            }
            System.out.println();
        }


    }
}
