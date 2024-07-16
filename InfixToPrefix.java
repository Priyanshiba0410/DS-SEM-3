import java.util.Stack;

public class InfixToPrefix
{
    public static String infixToPrefix(String infixExpression) 
    {
        StringBuilder result = new StringBuilder();
        Stack<Character> operatorStack = new Stack<>();
        boolean isOperator(char c)
         {
            return c == '+' || c == '-' || c == '*' || c == '/';
        }

        for (int i = infixExpression.length() - 1; i >= 0; i--) {
            char current = infixExpression.charAt(i);

            if (Character.isLetterOrDigit(current)) {
                result.append(current);
            } else if (isOperator(current)) {
                while (!operatorStack.isEmpty() && operatorStack.peek() != ')' &&
                       precedence(operatorStack.peek()) >= precedence(current)) {
                    result.append(operatorStack.pop());
                }
                operatorStack.push(current);
            } else if (current == ')') {
                operatorStack.push(current);
            } else if (current == '(') {
                while (!operatorStack.isEmpty() && operatorStack.peek() != ')') {
                    result.append(operatorStack.pop());
                }
                operatorStack.pop(); // Remove the matching ')'
            }
        }

        while (!operatorStack.isEmpty()) {
            result.append(operatorStack.pop());
        }

        return result.reverse().toString();
    }

    private static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;         }
    }

    public static void main(String[] args) {
        String infixExpression = "3 + 4 * 5";
        String prefixExpression = infixToPrefix(infixExpression);
        System.out.println("Prefix expression: " + prefixExpression);
    }
}
