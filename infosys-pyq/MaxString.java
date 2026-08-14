class MaxString {
    static String maxString(String number, char digit) {
        String max = "";

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {

                String newNumber =
                    number.substring(0, i) + number.substring(i + 1);

                if (newNumber.compareTo(max) > 0) {
                    max = newNumber;
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        String number = "1321";
        char digit = '1';

        System.out.println(maxString(number, digit));
    }
}