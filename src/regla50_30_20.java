import java.util.Scanner;

public class regla50_30_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su sueldo");
        double sueldo = sc.nextDouble();
        double ne,in,de;
        ne = sueldo*0.50;
        in = sueldo*0.20;
        de = sueldo*0.30;
        System.out.println("debe dejar " + ne + " para sus necesidades " + in + " para invertir y " + de + " para cosas personales");
    }
}
