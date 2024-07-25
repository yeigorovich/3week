public final class Operators {
    public static int Add(int... nums) {
        int temp = 0;
        for (int num : nums) {
            temp += num;
        }
        return temp;
    }

    public static int Subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int Multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int Divide(int num1, int num2) {
        return num1 / num2;
    }
}
