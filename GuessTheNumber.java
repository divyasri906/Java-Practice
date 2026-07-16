public class GuessTheNumber {

    static int pickedNumber = 6;

    
    public static int guess(int num) {
        if (num == pickedNumber) {
            return 0;
        } else if (num > pickedNumber) {
            return -1;
        } else {
            return 1;
        }
    }

    public static int guessNumber(int n) {

        int left = 1;
        int right = n;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            int result = guess(mid);

            if (result == 0) {
                return mid;
            } else if (result == -1) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int n = 10;

        System.out.println("Guessed Number = " + guessNumber(n));
    }
}