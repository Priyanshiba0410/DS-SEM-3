import java.util.Stack;

public class PrefixEvaluator 
{
    public static int evaluatePrefix(String prefixExpression) 
    {
        Stack<Integer> operandStack = new Stack<>();

        for (int i = prefixExpression.length() - 1; i >= 0; i--) 
        {
            char token = prefixExpression.charAt(i);

            if (Character.isDigit(token))
             {
                operandStack.push(token - '0'); 
             }
             else if (isOperator(token)) 
            {
                int operand1 = operandStack.pop();
                int operand2 = operandStack.pop();

                int result = performOperation(operand1, operand2, token);
                operandStack.push(result);
            }
        }

        return operandStack.pop();
    }

    private static boolean isOperator(char c) 
    {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    private static int performOperation(int operand1, int operand2, char operator) 
    {
        switch (operator) 
        {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    public static void main(String[] args)
     {
        String prefixExpression = "+*345";
        int result = evaluatePrefix(prefixExpression);
        System.out.println("Result: " + result);
    }
}
