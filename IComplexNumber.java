public interface IComplexNumber {
    double getRealPart();
    double getImaginaryPart();
    IComplexNumber addition(IComplexNumber other);
    IComplexNumber subtract(IComplexNumber other);
    IComplexNumber multiply(IComplexNumber other);
    IComplexNumber divide(IComplexNumber other);
}
