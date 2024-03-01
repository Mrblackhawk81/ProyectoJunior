import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Comparacion de numeros
        System.out.println("Ingrese dos numeros");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        boolean resp = true;
        boolean resp2 = false;
        if (a == b || sum > 100) {
            System.out.println(resp);
        } else {
            System.out.println(resp2);
        }
    }
}
