package main;

public enum MathTypeOperations {
    MULTIPLICATION("*"),
    SUM("+"),
    SUBSTRACTION("-"),
    DIVISION(":");
    private String type;

    MathTypeOperations(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
