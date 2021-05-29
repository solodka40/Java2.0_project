package Calculator.operations;

import Calculator.Calc;

public class Multy extends Calc {
    public Multy(double a, double b) {
        super(a, b);
    }
    @Override
    public double action (){
        return a*b;
    }
}
