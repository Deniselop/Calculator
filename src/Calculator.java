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
        return operation;
    }

    static double sum(double num1, double num2) {
        return num1 + num2;
    }

    static double sub(double num1, double num2) {
        return num1 - num2;
    }

    static double mult(double num1, double num2) {
        return num1 * num2;
    }

    static double div(double num1, double num2) {
        return num1 / num2;
    }
}
