// Divide.java
public class DivideComputation implements IComputation {
    @Override
    public int compute(int number1, int number2) {
        if (number2 != 0) {
            return number1 / number2;
        } else {
            throw new IllegalArgumentException("Division by zero");
        }
    }
}
