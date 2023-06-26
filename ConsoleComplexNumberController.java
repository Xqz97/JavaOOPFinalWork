public class ConsoleComplexNumberController implements IComplexNumberController {
    private IComplexNumberView view;
    private IComplexNumber firstNumber;
    private IComplexNumber secondNumber;

    public ConsoleComplexNumberController(IComplexNumberView view) {
        this.view = view;
    }

    @Override
    public void performOperation() {
        firstNumber = view.readComplexNumber();
        String operation = view.readOperation();
        secondNumber = view.readComplexNumber();

        IComplexNumber result = null;
        switch (operation) {
            case "+":
                result = firstNumber.addition(secondNumber);
                break;
            case "-":
                result = firstNumber.subtract(secondNumber);
                break;
            case "*":
                result = firstNumber.multiply(secondNumber);
                break;
            case "/":
                result = firstNumber.divide(secondNumber);
                break;
            default:
                System.out.println("Неверная операция");
        }

        if (result != null) {
            view.showResult(result);
        }
    }
}