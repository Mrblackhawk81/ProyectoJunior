import java.util.Scanner;

public class ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Comparar 3 numeros
        System.out.println("Ingrese 3 numeros");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean v = true;
        boolean f = false;
        if (a == b || b == c){
            System.out.println(v);
        } else {
            System.out.println(f);
        }
    }
}
