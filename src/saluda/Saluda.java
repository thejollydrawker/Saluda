
package saluda;

import java.util.Scanner;

public class Saluda {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String nombre;
      int edad;
        System.out.println("Introduzca su nombre: ");
        nombre = sc.nextLine();
        System.out.println("Introduzca su edad: ");
        edad = sc.nextInt();
        System.out.println("Hola "+ nombre + " tienes " + edad +" años.");
    }
    
}
