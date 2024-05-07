public enum MathTypeOperations {
    MULTIPLICATION("*"),
    SUM("+"),
    SUBSTRACTION("-"),
    DIVISION(":");
    private String type;

    MathTypeOperations(String type) {
        this.type = type;
    }

    public String getMathTypeOperations() {
        return type;
    }

    public int divisionMethod(int once, int twice) {
        return once / twice;
    }

    public int multiplicationMethod(int once, int twice) {
        return once * twice;
    }

    public int sumMethod(int once, int twice) {
        return once + twice;
    }

    public int substractionMethod(int once, int twice) {
        return once - twice;
    }
}
