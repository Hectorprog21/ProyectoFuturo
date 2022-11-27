import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Estudiante " + args[0] + " : " + args[1] + " Asignaturas Matriculadas.");
        System.out.println(("Estudia "+ args[2] + " Horas a la semana."));


            System.out.println("En cuantas asignaturas estas matriculado: ");
             String valor2 = String.valueOf(sc.nextInt());
            System.out.println("Horas que dedicas al estudio: ");
             String valor1 = String.valueOf(sc.nextInt());

            if (valor1.equals(valor2)) {
                System.out.println("Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.");
            }
            if (Integer.valueOf(valor1) < Integer.valueOf(valor2)) {
                System.out.println("Poco tiempo de estudio. Debes dedicar más tiempo.");
            } else {
                System.out.println("Ideal. Trabajas los contenidos en casa.");

            }

    }
}
