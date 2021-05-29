package Calculator.operations;

import Calculator.Calc;

public class Sum extends Calc {
    public Sum(double a, double b) {
        super(a, b);
    }

   @Override
   public double action (){
       return a+b;
   }

}
