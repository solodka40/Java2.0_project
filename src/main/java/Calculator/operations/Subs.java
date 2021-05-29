package Calculator.operations;

import Calculator.Calc;

public class Subs extends Calc {
    public Subs(double a, double b) {
        super(a, b);
    }
    @Override
    public double action (){
        return a-b;
    }
}
