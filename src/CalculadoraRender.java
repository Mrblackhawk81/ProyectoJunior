import java.util.Scanner;

public class CalculadoraRender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los minutos totales a renderizar ");
        double minutos = sc.nextDouble();
        double precioMinuto = minutos * 0.05f;
        System.out.println("el precio total a pagar por renderizar es de " + precioMinuto );
    }
}
