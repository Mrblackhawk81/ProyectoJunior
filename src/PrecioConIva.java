import java.util.Scanner;

public class PrecioConIva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto");
        float precio = sc.nextFloat();
        float iva;
        iva = precio*0.21f;
        float resta = precio - iva;
        System.out.println("Precio restando el iva al precio original " + resta);
    }
}
