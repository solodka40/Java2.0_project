import java.util.Arrays;
import java.util.Random;
public class Task4_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10;
        }
        System.out.println(Arrays.toString(array));
        int max_negative = Integer.MIN_VALUE;
        int min_positive = Integer.MAX_VALUE;
        int positive = 0, negative = 0;
        int sravnenie;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] < 0) && (max_negative < array[i])) {
                max_negative = array[i];
                negative = i;
            }
            if ((array[i] > 0) && (min_positive > array[i])) {
                min_positive = array[i];
                positive = i;
            }
        }
        System.out.println("Min positive: " + min_positive);
        System.out.println("Max negative: " + max_negative);
        sravnenie = array[negative];
        array[negative] = array[positive];
        array[positive] = sravnenie;
        System.out.println("Поменяем местами значения Min positive и Max negative:");
        System.out.println(Arrays.toString(array));
    }
}
