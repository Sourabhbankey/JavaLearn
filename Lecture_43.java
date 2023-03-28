package Exercise_23;

import java.util.Scanner;

public class Lecture_43 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        try {
            System.out.println("Enter  2 int Number");
            int a = kb.nextInt();
            int b = kb.nextInt();
            if (a <= 0) {
                ArithmeticException obj = new ArithmeticException("Numerator must be positive");
                throw obj;
            }
            int c = a / b;
            System.out.println("Div is " + c);
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }
}