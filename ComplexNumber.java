
public class ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public ComplexNumber addition(ComplexNumber other) {
        double newRealPart = this.realPart + other.realPart;
        double newImaginaryPart = this.imaginaryPart + other.imaginaryPart;
        return new ComplexNumber(newRealPart, newImaginaryPart);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        double newRealPart = this.realPart - other.realPart;
        double newImaginaryPart = this.imaginaryPart - other.imaginaryPart;
        return new ComplexNumber(newRealPart, newImaginaryPart);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double newRealPart = this.realPart * other.realPart - this.imaginaryPart * other.imaginaryPart;
        double newImaginaryPart = this.imaginaryPart * other.realPart + this.realPart * other.imaginaryPart;
        return new ComplexNumber(newRealPart, newImaginaryPart);
    }

    public ComplexNumber divide(ComplexNumber other) {
        double denominator = Math.pow(other.realPart, 2) + Math.pow(other.imaginaryPart, 2);
        double newRealPart = (this.realPart * other.realPart + this.imaginaryPart * other.imaginaryPart) / denominator;
        double newImaginaryPart = (this.imaginaryPart * other.realPart - this.realPart * other.imaginaryPart) / denominator;
        return new ComplexNumber(newRealPart, newImaginaryPart);
    }

    @Override
    public String toString() {
        if (imaginaryPart >= 0) {
            return realPart + " + " + imaginaryPart + "i";
        } else {
            return realPart + " - " + (-imaginaryPart) + "i";
        }
    }
}