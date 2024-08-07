import java.util.Scanner;

public class InfixToPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter infix: ");
        String infix = sc.nextLine();
        infix = reverse(infix);
        infix += ")";
        Stack st = new Stack(infix.length());
        st.push('(');
        StringBuilder polish = new StringBuilder();
        int i = 0;

        while (i < infix.length() && st.TOP != -1) {
            char next = infix.charAt(i);
            i++;

            if (next == ' ') {
                continue;
            }

            if (Character.isLowerCase(next)) {
                polish.append(next);
            } else if (next == '(') {
                st.push(next);
            } else if (next == ')') {
                while (st.TOP != -1 && st.peep(1) != '(') {
                    char temp = st.pop();
                    polish.append(temp);
                }
                st.pop(); // Pop the '('
            } else { // Operator
                while (st.TOP != -1 && stackPrecedence(st.peep(1)) > infixPrecedence(next)) {
                    char temp = st.pop();
                    polish.append(temp);
                }
                st.push(next);
            }
        }

        while (st.TOP != -1 && st.peep(1) != '(') {
            char temp = st.pop();
            polish.append(temp);
        }

        // Reverse the result to get the prefix notation
        System.out.println(reverse(polish.toString()));
    }

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static int infixPrecedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 3;
            case '^':
                return 6;
            case '(':
                return 0;
            case ')':
                return 7;
            default:
                return -1;
        }
    }

    public static int stackPrecedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 2;
            case '*':
            case '/':
                return 4;
            case '^':
                return 5;
            case '(':
                return 0;
            default:
                return -1;
        }
    }
}

class Stack {
    char[] S;
    int TOP = -1;
    int N;

    public Stack(int size) {
        N = size;
        S = new char[N];
    }

    public void push(char X) {
        if (TOP >= N - 1) {
            System.out.println("Stack Overflow");
        } else {
            TOP++;
            S[TOP] = X;
        }
    }

    public char pop() {
        if (TOP == -1) {
            System.out.println("Stack Underflow");
            return ' ';
        } else {
            return S[TOP--];
        }
    }

    public char peep(int index) {
        if (TOP - index + 1 < 0) {
            System.out.println("Stack Underflow");
            return ' ';
        } else {
            return S[TOP - index + 1];
        }
    }
}