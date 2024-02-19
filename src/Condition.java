import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {

        System.out.println("Автор: M.T");
        Scanner scanner = new Scanner(System.in);

        System.out.println("____________");
        System.out.print("\u001B[31mВведите три целых числа (a, b, c):\u001B[0m\n____________\n");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (isRightTriangle(a, b, c)) {
            System.out.println("a, b и c являются сторонами прямоугольного треугольника");
        } else if (isIsoscelesTriangle(a, b, c)) {
            System.out.println("a, b и c являются сторонами равнобедренного треугольника");
        } else if (a == b && b == c) {
            System.out.println("a, b и c являются у нас сторонами равностороннего треугольника");
        } else if (isValidTriangle(a, b, c)) {
            System.out.println("a, b и c относятся к обычному треугольнику");
        } else {
            System.out.println("a, b и c не относятся к сторонам нашего треугольника");
        }
    }
    private static boolean isRightTriangle(int a, int b, int c) {
        return (a * a + b * b == c * c) || (b * b + c * c == a * a) || (c * c + a * a == b * b);
    }
    private static boolean isIsoscelesTriangle(int a, int b, int c) {
        return a == b || b == c || c == a;
    }
    private static boolean isValidTriangle(int a, int b, int c) {
        return (a + b > c) && (b + c > a) && (c + a > b);
    }
}