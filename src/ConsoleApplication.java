public class ConsoleApplication {
    private final Reader reader = new ConsoleReader();
    private final Writer writer = new ConsoleWriter();
    private final Calculator calculator = new Calculator();



    public void run() {
        while (true) {
            writer.write("Enter first number");
            double num1 = reader.readDouble();
            writer.write("Enter second number");
            double num2 = reader.readDouble();
            writer.write("Enter operation type");
            String func = reader.readString();
            Operation operation = new Operation(num1, num2, func);
            Operation result = calculator.calculator(operation);
            writer.write("Result = " + result.getResult());

            writer.write("Would you like to continue? \n 1 - Continue, 2 - Exit");
            double number = reader.readDouble();

            switch ((int) number) {
                case 1:
                    continue;
                case 2:
                    return;
            }
        }
    }
}
