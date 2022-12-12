import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args){
        /*
         * Реализовать простой калькулятор
         */
        System.out.print("Введите числа для выполнения ");
        Scanner in = new Scanner (System.in);
        double a = in.nextInt();
        double b = in.nextInt();

        System.out.print("Введите тип операции, +, -, *, /, % ");
        char symbol = in.next().charAt(0);
        in.close();
        calculator(a,b,symbol);
    }
    public static double calculator (Double a, Double b, char symbol)
    {
        double result = 0; 
        if (symbol == '+') { 
            result = a + b; 
 
        } else if (symbol == '-') { 
            result = a - b; 
 
        } else if (symbol == '*') { 
            result = a * b; 
        } else if (symbol == '%') { 
            result = a % b; 
 
        } else if (symbol == '/') { 
            result = a / b; 
    }
    System.out.println("Получилось " + result); 
    return result; 
    }
}
