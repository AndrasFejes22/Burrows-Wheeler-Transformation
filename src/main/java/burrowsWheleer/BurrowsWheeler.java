package burrowsWheleer;

import java.util.*;

public class BurrowsWheeler {


    public static BWT encode(String s) {
        String[] arr = shifting(s);
        String lastLetters = lastLetters(arr);
        int num = inputNum(arr, s);
        return new BWT(lastLetters, num);          // new BWT("stuff", -1);
    }

    public static String decode(String s, int n) {
        // Your code here!
        return null;
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

}
