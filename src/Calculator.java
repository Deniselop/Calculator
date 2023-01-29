public class Calculator {

    public Operation calculator(Operation operation) {
        switch (operation.getFunc()) {
            case "sum": {
                operation.setResult(sum(operation.getNum1(), operation.getNum2()));
                return operation;
            }
            case "sub": {
                operation.setResult(sub(operation.getNum1(), operation.getNum2()));
                return operation;
            }
            case "mult": {
                operation.setResult(mult(operation.getNum1(), operation.getNum2()));
                return operation;
            }
            case "div": {
                operation.setResult(div(operation.getNum1(), operation.getNum2()));
                return operation;
            }
        }
        return null;
    }

    static double sum(double a, double b) {
        return a + b;
    }

    static double sub(double a, double b) {
        return a - b;
    }

    static double mult(double a, double b) {
        return a * b;
    }

    static double div(double a, double b) {
        return a / b;
    }
}
