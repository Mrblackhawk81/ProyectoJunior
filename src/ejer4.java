import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Verificar si un numero esta de un rango
        System.out.println("Ingrese un numero");
        int a = sc.nextInt();
        boolean v = true;
        boolean f = false;
        if (a>19 && a<51){
            System.out.println(v);
        } else {
            System.out.println(f);
        }
    }
}
