/**
 * Created by Администратор on 15.04.2017.
 * Created by Vladisson on 28.04.2017.
 */
public class Calculate {
    public static void main(String[] args) {

        System.out.println("Calculate...");
        int first = Integer.valueOf(args[0]);
        int second = Integer.valueOf(args [1]);
        int summ = first + second;
        double d = (double)first / second;
        double n = first * second;
        int minus = first - second;
        double stepen = Math.pow(first*1.0, second *1.0);
        System.out.println("Сложение = "+ summ + " Вычитание = " + minus + " Деление = "+ d + " Умножение = "+ n + " Возведение в степень = " + stepen);
    }
}