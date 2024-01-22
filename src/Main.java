import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите арифметическое выражение из двух чисел: ");
            String input = scanner.nextLine();
            String result = calc(input);
            System.out.println("Результат: " + result);
        }

        public static String calc(String input) {
            int num1 = Integer.parseInt(input.split(" ")[0]);
            int num2 = Integer.parseInt(input.split(" ")[2]);
            if (input.contains("+")) {
                return Integer.toString(num1 + num2);
            } else if (input.contains("-")) {
                return Integer.toString(num1 - num2);
            } else if (input.contains("/")) {
                return Integer.toString(num1 / num2);
            } else if (input.contains("*")) {
                return Integer.toString(num1 * num2);
            }
            return input;
        }
    }
