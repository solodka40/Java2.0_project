package Calculator;

import Calculator.operations.Div;
import Calculator.operations.Multy;
import Calculator.operations.Subs;
import Calculator.operations.Sum;

public class Main {
    public static void main(String[] args) {
        Read Read = new Read();
        double one;
        double two;
        System.out.print("Введите первое число:");
        one = Read.ReadNextDouble();
        System.out.print("Введите второе число:");
        two = Read.ReadNextDouble();
        Calc calc = new Calc(one, two);

        String znak;
        System.out.println("Введите знак математического действия: +,-,/,*");
        znak = Read.ReadNextLine();

        switch (znak) {
            case "*":
                Multy multy=new Multy(one,two);
                System.out.printf("Ответ: %.2f", multy.action());
                break;
            case "/":
                Div div=new Div(one,two);
                System.out.printf("Ответ: %.2f", div.action());
                break;
            case "+":
                Sum sum = new Sum(one,two);
                System.out.printf("Ответ: %.2f", sum.action());
                break;
            case "-":
                Subs subs=new Subs(one,two);
                System.out.printf("Ответ: %.2f", subs.action());
                break;
            default:
                System.out.println("Вы ввели неверный знак.");


        }

    }
}
