import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println(inputString(scanner));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static String inputString(Scanner scanner) throws Exception {
        System.out.println("Введите строку: ");
        String result;
        result = scanner.nextLine();
        if (result.equals("")) {
            throw new Exception("Нельзя вводить пустые строки");
        }
        return result;
    }
}