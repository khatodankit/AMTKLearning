public class ReverseString {

    public String reverseString(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder revStr = new StringBuilder();
        for (char c : charArray) {
            revStr.insert(0, c);
        }

        return revStr.toString();
    }
}
