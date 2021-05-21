/**
 * @author Alena Andreeva
 * @see #method main
 * @param args
 * переменные типа float для работы с дробными числами
 * форматирование происходит при выводе на экран
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        float n_1,n_2;
        System.out.println("Введите первое число:");
        n_1=number.nextFloat();
        System.out.println("Введите второе число:");
        n_2=number.nextFloat();
        Scanner ans = new Scanner(System.in);
        String znak;
        System.out.println("Введите знак математического действия: +,-,/,*");
        znak=ans.nextLine();

        switch (znak){
            case "*":System.out.printf("Ответ: %.4f",(n_1*n_2));
                break;
            case "/":System.out.printf("Ответ: %.4f",(n_1/n_2));
                break;
            case "+":System.out.printf("Ответ: %.4f",(n_1+n_2));
                break;
            case "-":System.out.printf("Ответ: %.4f",(n_1-n_2));
                break;
            default:
                System.out.println("Вы ввели неверный знак.");
        }

    }
}
