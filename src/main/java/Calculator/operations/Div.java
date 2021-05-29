package Calculator.operations;

import Calculator.Calc;

public class Div extends Calc {
    public Div(double a, double b) {
        super(a, b);
    }
    @Override
    public double action (){
        return a/b;
    }
}
