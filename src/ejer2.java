import java.util.Scanner;

public class ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Par Impar
        System.out.println("Ingrese un numero");
        int num = sc.nextInt();
        int par = num % 2;
        boolean v = true;
        boolean f = false;
        if (par == 0 ){
            System.out.println(v);
        }else {
            System.out.println(f);
        }
    }
}
