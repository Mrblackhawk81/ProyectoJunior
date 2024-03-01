import java.util.Scanner;

public class ejer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Verificar si una letra es vocal o constante
        System.out.println("Ingrese una letra");
        char letra = sc.nextLine().charAt(0);
        boolean v = true;
        boolean f = false;
        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(v);
                break;
            default:
                System.out.println(f);
                break;
        }
    }
}
