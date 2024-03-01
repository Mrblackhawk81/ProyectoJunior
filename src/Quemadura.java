import java.util.Scanner;

public class Quemadura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //if
        System.out.println("Mostrar informacion de quemaduras");

        System.out.println("1) Primer grado");
        System.out.println("2) Segundo grado");
        System.out.println("3) Tercer grado");
        int num = sc.nextInt();
        if (num == 1){
            System.out.println("Tratamiento");
        }
        else if (num == 2) {
            System.out.println("Hospital");
        }
        else if (num == 3) {
            System.out.println("Muerte");
        }
        else {
            System.out.println("opcion no valida");
        }
    }
}
