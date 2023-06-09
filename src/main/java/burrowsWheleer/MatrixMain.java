package burrowsWheleer;

import java.util.Arrays;

public class MatrixMain {

    public static void main(String[] args) {
        int[][] array
                = { {1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}};


        for (int j = 0; j < array.length; j++) {
            for (int i = array.length-1; i >=0; i--) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

        printColumn("ww MYeelllloo");
    }

    public static void printColumn(String input){
        System.out.println("pow: "+Math.pow(input.length(), 2));
        //StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        //String temp = null;
        //String []sortedArr = new String[4];
        //Arrays.sort(sorted);
        String[]arr = input.split("");
        String[]inputArr = input.split("");
        for (int i = 0; i < arr.length; i++) {
            //for (int j = 0; j < 4; j++) {
            String []sorted = input.split("");
            //String []notSorted = input.split("");
            Arrays.sort(sorted);
            System.out.println("concated: " + (sorted[i].concat(arr[i]) + " "));
            arr[i] = arr[i].concat(sorted[i]);
            System.out.println("arr1: " + Arrays.toString(arr));

        }
        Arrays.sort(arr);
        System.out.println("arr_1: "+Arrays.toString(arr));
        //while (sb2.toString().length()<(Math.pow(input.length(), 2))) {
        while (arr[0].length()<input.length()) {

            /*
            for (int i = 0; i < arr.length; i++) {
                //for (int j = 0; j < 4; j++) {
                String []sorted = input.split("");
                String []notSorted = input.split("");

                    Arrays.sort(sorted);
                    System.out.println("concated: " + (sorted[i].concat(arr[i]) + " "));
                    arr[i] = arr[i].concat(sorted[i]);
                    System.out.println("arr1: " + Arrays.toString(arr));



            }
            Arrays.sort(arr);
            System.out.println("arr_1: "+Arrays.toString(arr));
            //sb2.append(arrayToString(arr));
            //System.out.println("sb2: "+sb2);
            System.out.println("-----------------------------");
            */
            for (int i = 0; i < inputArr.length; i++) {

                    System.out.println("concated: " + (inputArr[i].concat(arr[i]) + " "));
                    arr[i] = inputArr[i].concat(arr[i]);
                    System.out.println("arr: " + Arrays.toString(arr));
            }

            Arrays.sort(arr);
            System.out.println("arr_2: "+Arrays.toString(arr));
            sb2.append(arrayToString(arr));
            //System.out.println("sb2: "+sb2);
            System.out.println("sb2: "+sb2.toString().length());
        }



        /*
        String[]tempArr = temp.split("");
        Arrays.sort(tempArr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(tempArr[i]);
        }
        */

    }
    public static int arrLength(String string){
        String []arr = string.split("");
        return arr.length;
    }

    public static String stringSort(String input){
        StringBuilder sb = new StringBuilder();
        String []arr = input.split("");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        return sb.toString();
    }

    public static String arrayToString(String []arr){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        return sb.toString();

    }



}
