import java.util.Scanner;

public class respiracion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Frecuencia de respiracion
        System.out.println("Ingrese la cantidad de respiraciones por minuto");
        int num = sc.nextInt();
        if (num >= 12 && num<= 20){
            System.out.println("La tasa de respiracion esta en el rango normal");
        }
        else if (num < 12 ){
            System.out.println("menor al rango");
        } else if (num > 20){
            System.out.println("mayor al rango");
        }
    }
}
