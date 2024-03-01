import java.util.Scanner;

public class ejer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Verificar si un año es bisiesto
        System.out.println("Ingrese un año");
        int año = sc.nextInt();
        boolean esBisiesto = false;
        if ((año % 4==0 && año % 100 !=0) || (año % 400 == 0)){
            esBisiesto = true;
        }
        System.out.println(esBisiesto);
    }
}
