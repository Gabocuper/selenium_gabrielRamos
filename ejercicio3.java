package clase8;

import java.util.Scanner;

public class ejercicio3 {

    //3.Método que reciba dos enteros y retorne la multiplicación de la misma.
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int num1 = input.nextInt();

        System.out.println("Ingrese otro numero");
        int num2 = input.nextInt();

        System.out.println("La multiplicacion es " + multiplicacion(num1, num2));
    }
        public static int multiplicacion ( int num1, int num2){
            return num1 * num2;
        }
    }