import java.util.Scanner; 
 
public class HomeWork1 { 
    public static void main(String[] args) { 
        /* 
         * Вычислить n-ое треугольное число(сумма чисел от 1 до n), n! (произведение 
         * чисел от 1 до n) 
         */ 
        int n; 
        int t; 
        System.out.println("Введите натуральное число n "); 
        Scanner in = new Scanner(System.in); 
        n = in.nextInt(); 
        in.close(); 
 
        t = n / 2 * (n + 1); 
        System.out.println(n + "-ое треугольное число = " + t + "; факториал n = " + getFactorial(n));   
    }     
    public static int getFactorial(int f) { 
        int result = 1; 
        for (int i = 1; i <= f; i++) { 
            result = result * i; 
        } 
        return result; 
    } 
 
}