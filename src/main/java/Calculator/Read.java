package Calculator;

import java.util.Scanner;

public class Read {
    public double ReadNextDouble() {
        Scanner sc = new Scanner(System.in);
        double i;
        i = sc.nextDouble();
        return i;
    }

    public String ReadNextLine() {
        Scanner ans = new Scanner(System.in);
        String j;
        j = ans.nextLine();
        return j;
    }
}

