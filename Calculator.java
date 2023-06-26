public class Calculator {
    public static void main(String[] args) {
        IComplexNumberView view = new ConsoleComplexNumberView();
        IComplexNumberController controller = new ConsoleComplexNumberController(view);

        while (view.shouldContinue()) {
            controller.performOperation();
        }
    }
}
