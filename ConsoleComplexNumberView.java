import java.util.Scanner;

public class ConsoleComplexNumberView implements IComplexNumberView {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void showResult(IComplexNumber result) {
        System.out.println("Результат: " + result.toString());
    }

    public IComplexNumber readComplexNumber() {
        System.out.print("Введите действительную часть: ");
        double real = scanner.nextDouble();
        System.out.print("Введите мнимую часть: ");
        double imaginary = scanner.nextDouble();
        return new ComplexNumberModel(real, imaginary);
    }

    public String readOperation() {
        System.out.print("Выберите операцию (+, -, *, /): ");
        return scanner.next();
    }

    public boolean shouldContinue() {
        System.out.println("Хотите продолжить работу? (Да/Нет)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine().toLowerCase();
        return answer.equals("да") || answer.equals("yes");
    }
}