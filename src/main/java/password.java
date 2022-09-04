public class password {

    public static void main(String [] args) {

    }
    public static String letterAmount(String kennwort) {
        int result = kennwort.length();
        return String.valueOf(result);
        }
    public static boolean includesNumbers(String kennwort) {
        boolean includesNum = true;
        String [] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for (int i = 0; i < 10; i++) {
            if (kennwort.contains(numbers[i])) {
                includesNum = true;
               break;
            } else {
                includesNum = false;
            }
            } return includesNum;

    }

}
