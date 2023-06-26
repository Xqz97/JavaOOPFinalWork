package model;

public interface ICalculatorModel {
    void doCalculation();
    void setFirstNumber(double realPart, double imaginaryPart);
    void setSecondNumber(double realPart, double imaginaryPart);
    ComplexNumber getResult();
    void setOperation(String operation);
}