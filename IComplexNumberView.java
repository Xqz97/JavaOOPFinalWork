public interface IComplexNumberView {
    void showResult(IComplexNumber result);

    IComplexNumber readComplexNumber();

    String readOperation();

    boolean shouldContinue();
}
