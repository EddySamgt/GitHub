import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESA TU NOMBRE:");
        String nombre = sc.nextLine();
        System.out.println("Hola " + nombre + " bienvenido");
        System.out.println(nombre + ", " + "¿Te gusta el pan?");
    }
}
