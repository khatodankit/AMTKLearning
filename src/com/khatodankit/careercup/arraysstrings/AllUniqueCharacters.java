package com.khatodankit.careercup.arraysstrings;

//Implement an algorithm to determine if a string has all unique characters What if you
//        can not use additional data structures?

public class AllUniqueCharacters {
    public static void main(String[] args) {


//        boolean result = AllUniqueCharacters.isAllUnique("");
        boolean result = AllUniqueCharacters.isAllUniqueUsingBoolArray("abcde12437;,f");
        if (result)
            System.out.println("Test Paas");
        else
            System.out.println("Test Fail");
    }

    //MySolution
    static boolean isAllUnique(String str) {

        for (int i = 0; i < str.length(); i++) {
            Character curr = str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                if (curr.equals(str.charAt(j)))
                    return false;
            }
        }
        return true;
    }

    //Book Solution assuming only ASCII chars in string
    static boolean isAllUniqueUsingBoolArray(String str) {
        boolean[] boolTable = new boolean[128];

        for (int i = 0; i < str.length(); i++) {
            if (boolTable[str.charAt(i)]) return false;
            boolTable[str.charAt(i)] = true;
        }

        return true;

    }


}
