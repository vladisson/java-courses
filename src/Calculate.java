/**
 * Created by Администратор on 15.04.2017.
 */
public class Calculate {
    public static void main(String[] args) {

        System.out.println("Calculate...");
        int first = Integer.valueOf(args[0]);
        int second = Integer.valueOf(args [1]);
        int summ = first + second;
        double d = first / second;
        double n = first * second;
        System.out.println("Sum = "+ summ + " Деление = "+ d + " Умножение = "+ n);
    }
}
