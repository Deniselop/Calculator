public class ConsoleApplication implements Application {
    private final Reader reader = new ConsoleReader();
    private final Writer writer = new ConsoleWriter();
    private final Calculator calculator = new Calculator();

    private Operation result;

    @Override
    public void run() {
        while (true) {
            writer.write("Enter first number");
            double number1 = reader.readDouble();
            writer.write("Enter second number");
            double number2 = reader.readDouble();
            writer.write("Enter operation type");
            String func = reader.readString();
            Operation operations = new Operation(number1, number2, func);
            result = calculator.calculator(operations);
        }
    }
}
