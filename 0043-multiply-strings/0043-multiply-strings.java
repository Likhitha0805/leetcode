public class Solution {
    public static String multiply(String num1, String num2) {
        // Handle edge case
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int len1 = num1.length();
        int len2 = num2.length();

        int[] result = new int[len1 + len2];

        // Multiply digits
        for (int i = len1 - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i) - '0';

            for (int j = len2 - 1; j >= 0; j--) {
                int digit2 = num2.charAt(j) - '0';

                int product = digit1 * digit2;
                int posLow = i + j + 1;
                int posHigh = i + j;

                product += result[posLow];

                result[posLow] = product % 10;
                result[posHigh] += product / 10;
            }
        }

        // Convert result array to string
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) {
                sb.append(num);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Example 1 Output: " + multiply("2", "3"));         // Output: 6
        System.out.println("Example 2 Output: " + multiply("123", "456"));     // Output: 56088
    }
}
