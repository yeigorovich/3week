public class SimpleCalculator {
    public static void main(String[] args) {
        int resultOfAdding = Operators.Add(13, 23);
        System.out.println(resultOfAdding);

        int resultOfSubtracting = Operators.Subtract(13, 23);
        System.out.println(resultOfSubtracting);

        int resultOfMultiplying = Operators.Multiply(10, 5);
        System.out.println(resultOfMultiplying);

        int resultOfDividing = Operators.Divide(20, 5);
        System.out.println(resultOfDividing);
    }
}
