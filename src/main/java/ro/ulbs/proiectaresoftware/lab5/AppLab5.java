package ro.ulbs.proiectaresoftware.lab5;

class IntCalculator {
    protected int state;

    public IntCalculator(int initialValue) {
        this.state = initialValue;
    }

    public IntCalculator add(int value) {
        state += value;
        return this;
    }

    public IntCalculator subtract(int value) {
        state -= value;
        return this;
    }

    public IntCalculator multiply(int value) {
        state *= value;
        return this;
    }

    public int result() {
        return state;
    }

    public IntCalculator clear() {
        state = 0;
        return this;
    }
}

class AdvancedCalculator extends IntCalculator {

    public AdvancedCalculator(int initialValue) {
        super(initialValue);
    }

    public AdvancedCalculator divide(int value) {
        if (value != 0) {
            state /= value;
        } else {
            System.out.println("Nu se poate imparti la 0!");
        }
        return this;
    }

    public AdvancedCalculator power(int exponent) {
        state = (int) Math.pow(state, exponent);
        return this;
    }

    public AdvancedCalculator root(int n) {
        if (n > 0) {
            state = (int) Math.pow(state, 1.0 / n);
        } else {
            System.out.println("Radical invalid!");
        }
        return this;
    }
}

public class AppLab5 {
    public static void main(String[] args) {

        IntCalculator calculator = new IntCalculator(10);
        int result = calculator
                .add(5)
                .subtract(3)
                .multiply(2)
                .result();

        System.out.println("a) " + result);

        AdvancedCalculator advCalc = new AdvancedCalculator(10);
        int result2 = advCalc
                .add(5)
                .multiply(2)
                .divide(3)
                .power(2)
                .root(2)
                .result();

        System.out.println("b) " + result2);
    }
}