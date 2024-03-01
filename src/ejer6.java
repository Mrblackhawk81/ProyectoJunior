import java.util.Scanner;

public class ejer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Verificar si una cadena contiene una subcadena especifica
        System.out.println("Ingrese una cadena de texto");
        String cadena = sc.nextLine();
        String espe = "defensa";
        boolean v = true;
        boolean f = false;
        if (cadena.contains(espe)){
            System.out.println(v);
        } else {
            System.out.println(f);
        }
    }
}
