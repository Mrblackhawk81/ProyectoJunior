import java.util.Scanner;

public class ejer8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Comprobar si un nuemero es positivon, negativo o cero
        System.out.println("Ingrese un numero");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("es positivo");
        } else if (num < 0) {
            System.out.println("es negativo");
        } else {
            System.out.println("es cero");
        }
    }
}
