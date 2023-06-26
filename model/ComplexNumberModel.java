package model;

public class ComplexNumberModel implements ICalculatorModel {

    private ComplexNumber firstNumber;
    private ComplexNumber secondNumber;
    private ComplexNumber result;
    private String operation;

    @Override
    public void doCalculation() {
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
        }
    }


    @Override
    public void setFirstNumber(double realPart, double imaginaryPart) {
        this.firstNumber = new ComplexNumber(realPart, imaginaryPart);
    }

    @Override
    public void setSecondNumber(double realPart, double imaginaryPart) {
        this.secondNumber = new ComplexNumber(realPart, imaginaryPart);
    }

    @Override
    public ComplexNumber getResult() {
        return result;
    }

    @Override public void setOperation(String operation) {
        this.operation = operation;
    }
}