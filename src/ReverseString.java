public class ReverseString {
    public String reverseStringBasic(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder revStr = new StringBuilder();
        for (char c : charArray) {
            revStr.insert(0, c);
        }
        return revStr.toString();
    }


    public String reverseStringSingleVarSpace(String str) {
        char[] charArray = str.toCharArray();
        char tempVar;
        int length = charArray.length;
        for (int i = 0; i < (length / 2); i++) {
            tempVar = charArray[length - i - 1];
            charArray[length - i - 1] = charArray[i];
            charArray[i] = tempVar;
        }
        return String.copyValueOf(charArray);

    }

    public String reverseStringRecursive(String str) {
        if (str.length() <= 1)
            return str;

        return reverseStringRecursive(str.substring(1) + str.charAt(0));
    }
}