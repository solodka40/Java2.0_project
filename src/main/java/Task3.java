import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Выберите режим работы: 1-калькулятор, 2-поиск самого длинного слова");
        int mode = vvod.nextInt();
        if (mode == 1) {
            float n_1, n_2;
            System.out.println("Введите первое число:");
            n_1 = vvod.nextFloat();
            System.out.println("Введите второе число:");
            n_2 = vvod.nextFloat();
            Scanner ans = new Scanner(System.in);
            String znak;
            System.out.println("Введите знак математического действия: +,-,/,*");
            znak = ans.nextLine();
            switch (znak) {
                case "*":
                    System.out.printf("Ответ: %.4f", (n_1 * n_2));
                    break;
                case "/":
                    System.out.printf("Ответ: %.4f", (n_1 / n_2));
                    break;
                case "+":
                    System.out.printf("Ответ: %.4f", (n_1 + n_2));
                    break;
                case "-":
                    System.out.printf("Ответ: %.4f", (n_1 - n_2));
                    break;
                default:
                    System.out.println("Вы ввели неверный знак.");
            }
        } else if (mode == 2) {
            String[] stroka;
            int n;
            System.out.println("Введите число элементов массива:");
            n = vvod.nextInt();
            stroka = new String[n];
            for (int i = 0; i < n; i++) {
                System.out.println(i + 1 + " слово:");
                stroka[i] = vvod.next();
            }
            int maxLengthString = 0;
            for (int i = 0; i < stroka.length; i++) {
                if (stroka[i].length() > maxLengthString) {
                    maxLengthString = stroka[i].length();
                }
            }
            for (int i = 0; i < stroka.length; i++) {
                if (stroka[i].length() == maxLengthString) {
                    System.out.println("Самое длинное слово:" + stroka[i]);
                }
            }
        } else {
            System.out.println("Вы ввели неверное значение.");
        }
    }
}



