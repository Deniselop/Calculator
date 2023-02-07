public class Operation {
    private double num1;
    private double num2;
    private double result;
    private String func;


    public Operation(double num1, double result, double num2, String func) {
        this.num1 = num1;
        this.result = result;
        this.func = func;
        this.num2 = num2;
    }

    public Operation(double number1, double number2, String func) {
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public String getFunc() {
        return func;
    }

    public double getResult(){return result; }
    public void setResult(double result) {
        this.result = result;
    }

    public void setFunc(String func){
        this.func = func;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", result=" + result +
                ", func='" + func + '\'' +
                '}';
    }
}
