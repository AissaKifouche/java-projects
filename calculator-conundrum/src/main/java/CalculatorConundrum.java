class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        if (operation == null) throw new IllegalOperationException("Operation cannot be null");
        else if (operation.isEmpty()) throw new IllegalOperationException("Operation cannot be empty");

        switch (operation) {
                case "+" -> {
                    int result = operand1 + operand2;
                    return String.format("%d %s %d = %d", operand1, operation, operand2, result);
                }
                case "*" -> {
                    int result = operand1 * operand2;
                    return String.format("%d %s %d = %d", operand1, operation, operand2, result);
                }
                case "/" -> {
                    try {
                        int result = operand1 / operand2;
                        return String.format("%d %s %d = %d", operand1, operation, operand2, result);
                    } catch (ArithmeticException e) {
                        throw new IllegalOperationException("Division by zero is not allowed");
                    }
                }
                default -> throw new IllegalOperationException("Operation " + operation + " does not exist");
        }

        return "";
    }
}
