

public class Calculator {
    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }


    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        double result;

        if (purchaseAmount > 0){
            if (discountAmount > 0 && discountAmount <=100) {
                result = purchaseAmount * (100 - discountAmount)/100;
            }
            else {
                throw new ArithmeticException("Скидка должна быть в диапозоне от 0 до 100 процентов");
            }
        }
        else {
            throw new ArithmeticException("Сумма покупки должна быть больше 0");
        }
        return result;
    }


}