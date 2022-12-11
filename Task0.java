import java.util.Scanner;

public class Task0 {

    public static void main(String[] args) {
        inputFloat();
    }

    public static float inputFloat() {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите дробное число, дробная часть отделяется запятой: ");
        while (!in.hasNextFloat()) {
            System.out.print("Неправильный ввод данных: ");
            in.next();
        }
        return in.nextFloat();
    }
}