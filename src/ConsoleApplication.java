public class ConsoleApplication {
    private final Reader reader = new ConsoleReader();
    private final Writer writer = new ConsoleWriter();
    private final Calculator calculator = new Calculator();

    private Operation result;


    public void run() {
        while (true) {
            writer.write("Enter first number");
            double number1 = reader.readDouble();
            writer.write("Enter second number");
            double number2 = reader.readDouble();
            writer.write("Enter operation type");
            String func = reader.readString();
            Operation operations = new Operation(number1, number2, func);
            Operation result = calculator.calculator(operations);
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
