import java.util.Scanner;

public class FrecuenciaCardiaca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Frecuencia Cardiaca
        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();
        System.out.println("Ingrese su nivel de actividad");
        System.out.println("1) Sedentario");
        System.out.println("2) Moderado");
        System.out.println("3) Activo");
        int nivel = sc.nextInt();
        System.out.println("Ingrese su sexo");
        System.out.println("1) Hombre");
        System.out.println("2) Mujer");
        int sexo = sc.nextInt();
        boolean esHombre = sexo == 1;

        int frecuenciaMaxima;
        if (esHombre){
            frecuenciaMaxima = 220 - edad;
        } else {
            frecuenciaMaxima = 226 - edad;
        }
        System.out.println("Frecuencia cardiaca maxima: " + frecuenciaMaxima);


        double rangoMinimo = 0;
        double rangoMaximo = 0;

        final int SEDENTARIO = 1;
        final int MODERADO = 2;
        final int ACTIVO = 3;

        if (nivel == SEDENTARIO){
            rangoMinimo = frecuenciaMaxima * 0.5;
        } else if (nivel == MODERADO){
            rangoMinimo = frecuenciaMaxima * 0.6;
        } else if (nivel == ACTIVO){
            rangoMinimo = frecuenciaMaxima * 0.7;
        }
        rangoMaximo = frecuenciaMaxima * 0.85;
        System.out.println("Su rango objetivo de frecuencia cardiaca es entre "
                + rangoMinimo  + " a  "  + rangoMaximo
                + " latidos por minuto.");
    }
}
