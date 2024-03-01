import java.util.Scanner;

public class ejer9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //verificar si un numero es primo
        System.out.println("Ingrese un numero");
        int num = sc.nextInt();
        if (num % num == 0){
            System.out.println("es primo");
        } else {
            System.out.println("no es primo");
        }
    }
}
