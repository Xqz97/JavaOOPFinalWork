public class ComplexNumberModel implements IComplexNumber {
    private double realPart;
    private double imaginaryPart;

    public ComplexNumberModel(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public IComplexNumber addition(IComplexNumber other) {
        double newRealPart = this.realPart + other.getRealPart();
        double newImaginaryPart = this.imaginaryPart + other.getImaginaryPart();
        return new ComplexNumberModel(newRealPart, newImaginaryPart);
    }

    public IComplexNumber subtract(IComplexNumber other) {
        double newRealPart = this.realPart - other.getRealPart();
        double newImaginaryPart = this.imaginaryPart - other.getImaginaryPart();
        return new ComplexNumberModel(newRealPart, newImaginaryPart);
    }

    public IComplexNumber multiply(IComplexNumber other) {
        double newRealPart = this.realPart * other.getRealPart() - this.imaginaryPart * other.getImaginaryPart();
        double newImaginaryPart = this.imaginaryPart * other.getRealPart() + this.realPart * other.getImaginaryPart();
        return new ComplexNumberModel(newRealPart, newImaginaryPart);
    }

    public IComplexNumber divide(IComplexNumber other) {
        double denominator = Math.pow(other.getRealPart(), 2) + Math.pow(other.getImaginaryPart(), 2);
        double newRealPart = (this.realPart * other.getRealPart() + this.imaginaryPart * other.getImaginaryPart()) / denominator;
        double newImaginaryPart = (this.imaginaryPart * other.getRealPart() - this.realPart * other.getImaginaryPart()) / denominator;
        return new ComplexNumberModel(newRealPart, newImaginaryPart);
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