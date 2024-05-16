
package Modelo;

/**
 *
 * @author Alejandro Arias
 */
public class model {
   
 
   private Stack stack;
   public  model() {
        this.stack = new Stack();
    }

   public int evaluateRPN(String expression) {
        String[] tokens = expression.split(" ");
        for (String token : tokens) {
            if (isDigit(token)) {
                stack.push(new Node(Integer.parseInt(token)));
            } else {
                Node right = stack.pop();
                Node left = stack.pop();
                stack.push(new Node(getResult(token, left.value, right.value)));
            }
        }
        return stack.pop().value;
    }

    private boolean isDigit(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private int getResult(String operator, int left, int right) {
        switch (operator) {
            case "+":
                return left + right;
            case "-":
                return left - right;
            case "*":
                return left * right;
            case "/":
                return left / right;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}

