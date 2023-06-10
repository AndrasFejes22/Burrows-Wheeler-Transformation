package burrowsWheleer;

import java.util.*;

public class BurrowsWheeler {


    public static BWT2 encode(String s) {
        if(s.isEmpty()){
            return new BWT2("", 0);
        }else {
            System.out.println("string: " + s);
            String[] arr = shifting(s);
            String lastLetters = lastLetters(arr);
            int num = inputNum(arr, s);
            return new BWT2(lastLetters, num);
        }
    }

    //For the empty input, the row number is ignored.
    public static String decode(String s, int n) {
        if(s.isEmpty() || n < 0){
            return "";
        }else {
            String[] arr = s.split("");
            String[] inputArr = s.split("");
            for (int i = 0; i < arr.length; i++) {
                String[] sorted = s.split("");
                Arrays.sort(sorted);
                arr[i] = arr[i].concat(sorted[i]);
            }
            Arrays.sort(arr);
            while (arr[0].length() < s.length()) {

                for (int i = 0; i < inputArr.length; i++) {
                    arr[i] = inputArr[i].concat(arr[i]);
                }
                Arrays.sort(arr);
            }

            return arr[n];
        }
    }

    // no need here
    public static Set<String> getPermutation(String str) {

        // create a set to avoid duplicate permutation
        Set<String> permutations = new TreeSet<>();

        // check if string is null
        if (str == null) {
            return null;
        } else if (str.length() == 0) {
            // terminating condition for recursion
            permutations.add("");
            return permutations;
        }

        // get the first character
        char first = str.charAt(0);

        // get the remaining substring
        String sub = str.substring(1);

        // make recursive call to getPermutation()
        Set<String> words = getPermutation(sub);

        // access each element from words
        for (String strNew : words) {
            for (int i = 0;i<=strNew.length();i++){

                // insert the permutation to the set
                permutations.add(strNew.substring(0, i) + first + strNew.substring(i));
            }
        }

        return permutations;
    }

    public static String shift(String input){
        String end = input.substring(input.length()-1);
        String begin = input.substring(0, input.length()-1);
        return end.concat(begin);
    }

    public static String[] shifting(String input){
        String[] arr = new String[input.length()];
        arr[0] = input;
        for (int i = 1; i < input.length(); i++) {
            arr[i] = shift(arr[i-1]);
        }
        Arrays.sort(arr);
        return arr;
    }

    public static String lastLetters(String[] arr){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            stringBuilder.append(arr[i].substring(arr[i].length()-1));
        }
        return stringBuilder.toString();
    }

    public static int inputNum(String[] arr, String input){
        int num = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i].equals(input)){
                num = i;
            }
        }
        return num;
    }

    public static void printMatrix(String[] arr){
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }
        System.out.println();
    }
    public static void printMatrix2D(String[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                System.out.print(arr[i][j]);
            }
        }
        System.out.println();
    }


    public static String [][] stringTo2DArray(String input){
        String [] arr1 = input.split("");
        String [][] array = new String[input.length()][1];
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j <1; j++) {
                array[i][j] = arr1[i];
            }

        }
        return array;
    }

    public static class BWT2 {

        public String s;
        public int n;

        public BWT2(String s, int n) {
            this.s = s;
            this.n = n;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            BWT2 bwt2 = (BWT2) o;
            return n == bwt2.n && Objects.equals(s, bwt2.s);
        }

        @Override
        public int hashCode() {
            return Objects.hash(s, n);
        }

        @Override
        public String toString() {
            return "BWT2{" +
                    "s='" + s + '\'' +
                    ", n=" + n +
                    '}';
        }
    }

}
