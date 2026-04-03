package ro.ulbs.proiectaresoftware.lab5.advanced;
package lab5.advanced;

abstract class ACalculator {
    protected Object state;

    public Object result() {
        return state;
    }

    public void clear() {
        state = null;
    }

    public abstract void init(Object value);
}

class NewIntCalculator extends ACalculator {

    @Override
    public void init(Object value) {
        this.state = (Integer) value;
    }

    public NewIntCalculator add(Integer value) {
        state = (Integer) state + value;
        return this;
    }

    public NewIntCalculator subtract(Integer value) {
        state = (Integer) state - value;
        return this;
    }

    public NewIntCalculator multiply(Integer value) {
        state = (Integer) state * value;
        return this;
    }
}

class DoubleCalculator extends ACalculator {

    @Override
    public void init(Object value) {
        this.state = (Double) value;
    }

    public DoubleCalculator add(Double value) {
        state = (Double) state + value;
        return this;
    }

    public DoubleCalculator subtract(Double value) {
        state = (Double) state - value;
        return this;
    }

    public DoubleCalculator multiply(Double value) {
        state = (Double) state * value;
        return this;
    }
}

public class Lab5Adv {
    public static void main(String[] args) {

        // Integer calculator
        NewIntCalculator intCalc = new NewIntCalculator();
        intCalc.init(10);

        Integer resultInt = intCalc
                .add(5)
                .subtract(3)
                .multiply(2)
                .result();

        System.out.println("Int result: " + resultInt);

        DoubleCalculator doubleCalc = new DoubleCalculator();
        doubleCalc.init(10.0);

        Double resultDouble = doubleCalc
                .add(5.0)
                .subtract(3.3)
                .multiply(2.2)
                .result();

        System.out.println("Double result: " + resultDouble);
    }
}
