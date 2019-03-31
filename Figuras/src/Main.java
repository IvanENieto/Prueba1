import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<rectangulo>rectangulos = new ArrayList<rectangulo>();
		ArrayList<Triangulo>triangulos = new ArrayList<Triangulo>();
		
		Pantalla menu = new Pantalla(rectangulos,triangulos);
		
		Scanner sc = new Scanner(System.in);
		int menus = 0;
		
		do {
		System.out.println("Introduce : \n"
				+ "1.- Añadir figura \n"
				+ "2.- Modificar figura \n"
				+ "3.- Mostrar pantall \n"
				+ "4.- Area pantalla \n"
				+ "5.- Listar figuras \n"
				+ "0.- Apagar");
		
		menus = sc.nextInt();
			
		
		switch(menus) {
		
		case 1:
			System.out.println("Elige la figura \n"
					+ "1.- Triangulo \n"
					+ "2.- Rectangulo");
			menu.añade_figura(sc.next());
			
			
			break;
		case 2:
			System.out.println("Introduce el caracter deseado");
			menu.modifica_figura(sc.next().charAt(0));
					
			break;
		case 3:
			menu.muestra_pantalla();
			
			break;
		case 4:
			menu.area_pantalla();
			
			break;
		case 5:
			menu.lista_figuras();
			
			break;
		}
			
		}while(menus!=0);

	}

}
