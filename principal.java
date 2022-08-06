import java.util.Scanner;

public class principal {
	public static void main(String[] args) {
		Perro laki = new Perro();
		Persona oscar  = new Persona();
		System.out.println("Bienvenido a la veterianaria");
		System.out.println("Escribe el numero que se quiere");
		Scanner teclado = new Scanner(System.in);
		System.out.println("1. Nueva persona:");
		System.out.println("2. Nuevo perro");
		System.out.println("3. Sacar galleta");
		System.out.println("4. Interactuar");
		System.out.println("5. Salir");
		String name = teclado.nextLine();


	}
}
        