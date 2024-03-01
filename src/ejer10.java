import java.util.Scanner;

public class ejer10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Comprobar edades
        System.out.println("Ingrese 2 edades");
        int edad1 = sc.nextInt();
        int edad2 = sc.nextInt();
        boolean esMayor = false;
        if (edad1 >= 18 || edad2>=18){
            esMayor = true;
        }
        System.out.println(esMayor);
    }
}
