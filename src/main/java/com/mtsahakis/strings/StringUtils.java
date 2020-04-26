package com.mtsahakis.strings;

import java.nio.charset.Charset;
import java.util.*;

public class StringUtils {

    public static String reverseInPlace(String str) {
        // input validation - quick return
        if (str == null || str.isEmpty()) {
            return str;
        }

        char[] strCharArray = str.toCharArray();
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            swap(strCharArray, i, length - i - 1);
        }
        return new String(strCharArray);
    }

    public static String reverseWithRecursion(String str) {
        // input validation - quick return
        if (str == null || str.isEmpty()) {
            return str;
        }

        return reverseWithRecursion(str.substring(1)) + str.charAt(0);
    }

    public static Map<Character, Integer> duplicateCharacters(String str) {
        // input validation - quick return
        if (str == null || str.isEmpty()) {
            return Collections.emptyMap();
        }

        Map<Character, Integer> duplicates = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (duplicates.containsKey(current)) {
                duplicates.put(current, duplicates.get(current) + 1);
            } else {
                duplicates.put(current, 1);
            }
        }

        return duplicates;
    }

    public static boolean isAnagramWithArrays(String str1, String str2) {
        // input validation - quick return
        if (str1 == null || str1.isEmpty() || str2 == null || str2.isEmpty() || str1.length() != str2.length()) {
            return false;
        }

        char[] str1CharArray = str1.toCharArray();
        Arrays.sort(str1CharArray);
        char[] str2CharArray = str2.toCharArray();
        Arrays.sort(str2CharArray);

        return Arrays.equals(str1CharArray, str2CharArray);
    }

    public static boolean isAnagramByRemovingChars(String str1, String str2) {
        if (str1 == null || str1.isEmpty() || str2 == null || str2.isEmpty() || str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            int index = str2.indexOf(str1.charAt(i));
            if (index < 0) {
                return false;
            }
            str2 = str2.substring(0, index) + str2.substring(index + 1);
        }
        return str2.isEmpty();
    }

    public static void permutations(String str, String ans) {
        if (str == null) {
            return;
        }

        System.out.println("Call: " + str + ", " + ans);

        // If string is empty
        if (str.length() == 0) {
            System.out.println(ans);
            System.out.println("########");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            System.out.println("i " + i);

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding the ith character
            String ros = str.substring(0, i) + str.substring(i + 1);

            // Recursive call
            permutations(ros, ans + ch);
        }
    }

    public static int countVowels(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int result = 0;
        char[] chars = str.toCharArray();
        for (char c : chars) {
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    result++;
                    break;
                default:
                    break;
            }
        }
        return result;
    }

    public static int stringToInt(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Invalid input: " + str);
        }

        int result = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int numeric = Character.getNumericValue(chars[i]);
            result += numeric * Math.pow(10, chars.length - 1 - i);
        }
        return result;
    }

    public static String removeDuplicateCharacters(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        Set<Character> uniqueChars = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (!uniqueChars.contains(current)) {
                result.append(current);
            }
            uniqueChars.add(current);
        }
        return result.toString();
    }

    public static String byteToString(byte[] input) {
        return new String(input, Charset.forName("UTF-8"));
    }

    private static void swap(char[] strToCharArray, int i, int j) {
        char tmp = strToCharArray[i];
        strToCharArray[i] = strToCharArray[j];
        strToCharArray[j] = tmp;
    }

}
